package domain.game.donkey;

import java.util.Set;

import domain.DomainException;
import domain.card.Card;
import domain.card.Deck;
import domain.game.CardGame;
import domain.player.Player;
import domain.player.donkey.DonkeyHumanPlayer;
import domain.game.donkey.strategy.DonkeyGameStrategy;

public class DonkeyGame extends CardGame {


	/*
	 * Rules
	 * -----
	 * Every player gets 4 random cards from the set.
	 * Every player gets 5 seconds to pass a card to his/her neighbor
	 * If the player was unable to pass his card on time a letter of the word "EZEL" is added
	 * Player loses when he has the whole word.
	 * Game stops when a player has 4 cards of the same value.
	 * 
	 */
	
	Card c heldCard ;
	
	public DonkeyGame(Set<Player> players) throws DomainException {
		super(players);
		
	}
	@Override
	public Player getWinner() {
		int stopped = 0;
		
		for(Player p : players){
			if(((DonkeyGameStrategy) p.getCardGameStrategy()).isStopped() == true){
				stopped ++;
			}
			
			
			if (stopped == players.size()){
				for(Player pl : this.players){
					if(((DonkeyHumanPlayer) p).getAmountSameValue() == 4 ){
						return p;
					}
				}
			}
		}
				
		return null;
	}
	
	@Override
	public Player play() {
		for (Player pl : players){
			while(this.getWinner() ==  null){
				//TODO 
			}
		}
		return currentPlayer;

	}
  
 /*
  * The max players for this game 12
  * Min = 3 
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
		Deck d = new Deck();
		d.shuffleDeck();
		return this.deck = d;
	
		
	}

}
