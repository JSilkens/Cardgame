package domain.game.donkey;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import domain.DomainException;
import domain.GameObserver;
import domain.card.Card;
import domain.card.Deck;
import domain.card.Symbol;
import domain.card.Value;
import domain.game.CardGame;
import domain.player.Player;
import domain.player.donkey.DonkeyHumanPlayer;
import domain.game.donkey.strategy.DonkeyGameStrategy;

public class DonkeyGame extends CardGame {

	/*
	 * Rules ----- Every player gets 4 random cards from the set. Every player
	 * gets 5 seconds to pass a card to his/her neighbor If the player was
	 * unable to pass his card on time a letter of the word "EZEL" is added
	 * Player loses when he has the whole word. Game stops when a player has 4
	 * cards of the same value.
	 */

	private Card heldCard;
	

	public DonkeyGame(Set<Player> players) throws DomainException {
		super(players);
		dealCards();
		setCurrentPlayer(players.iterator().next());
		

	}

	private void dealCards() {
		
		this.deck.shuffleDeck();
		for (Player p : this.players) {
			for (int i = 0; i < 4; i++) {
				p.addCard(deck.takeCardFromDeck());
			}
		}

	}

	@Override
	public Player getWinner() {
		int stopped = 0;

		for (Player p : players) {
			if (((DonkeyGameStrategy) p.getCardGameStrategy()).isStopped() == true) {
				stopped++;
			}

			if (stopped == players.size()) {
				for (Player pl : this.players) {
					if (((DonkeyHumanPlayer) p).getAmountSameValue() == 4) {
						return p;
					}
				}
			}
		}

		return null;
	}

	

	/*
	 * The max players for this game 12 Min = 3
	 * 
	 * @see domain.game.CardGame#getMaxPlayers()
	 */
	@Override
	public int getMaxPlayers() {
		return 12;
	}

	@Override
	public int getMinPlayers() {

		return 3;
	}
	
	

	@Override
	public Deck createDeck() {

		List<Card> cardDeck = new ArrayList<Card>();

		// Iterate over Symbols
		for (Symbol s : Symbol.values()) {
			// Iterate over Values
			for (Value v : Value.values()) {
				if(v.getValue() >= 10){
					Card c = new Card(v, s);
				    cardDeck.add(c);
				}
				
			}
		}
		
		return new Deck(cardDeck);

	}

	public void setHeldCard(Card c) {
		this.heldCard = c;
	}

	public Card getCard() {
		return this.heldCard;
	}

	@Override
	public void addObserver(GameObserver observer) {
		this.gameObserver = observer;
		
	}

	@Override
	public void removeObserver() {
		this.gameObserver = null;
		
	}

	@Override
	public void notifyObserver() {
		this.gameObserver.update(this);
		
	}




}
