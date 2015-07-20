package domain.game;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.DomainException;
import domain.card.Card;
import domain.player.Player;

public abstract class CardGame {
	private List<Card> cards;
	private Player currentPlayer;
	protected Set<Player> players;

	public CardGame(Set<Player> players) {
		this.cards = createDeck();
		setPlayers(players);
		
	}

	private void setPlayers(Set<Player> players) {
		this.players = players;
		
	}
	

	public void add(Card c) throws DomainException {
		if (c == null) {
			throw new DomainException("No card was given to the game");
		} else {
			this.cards.add(c);
		}

	}
	
	public Card getCardFromStack(){
		return cards.remove(0);
	}
	
	public Player play(){
		for (Player p : players){
			
			
			while (getWinner() == null ){
			
		    }
		}
		
		return currentPlayer;
	}
	
	public abstract Player getWinner();

	public abstract List<Card> createDeck();
	public abstract int getMaxPlayers();
	public abstract int getMinPlayers();
	
	
	
	
	

}
