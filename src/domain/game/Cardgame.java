package domain.game;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.DomainException;
import domain.card.Card;
import domain.card.Deck;
import domain.player.Player;

public abstract class CardGame {
	protected Deck deck;
	protected Player currentPlayer;
	protected Set<Player> players;

	public CardGame(Set<Player> players) {
		this.deck = createDeck();
		setPlayers(players);
		
	}

	private void setPlayers(Set<Player> players) {
		this.players = players;
		
	}
	

	
	
	public Player play(){
		for (Player p : players){
			
			
			while (getWinner() == null ){
			
		    }
		}
		
		return currentPlayer;
	}
	
	public abstract Player getWinner();

	public abstract Deck createDeck();
	public abstract int getMaxPlayers();
	public abstract int getMinPlayers();

	public Card getCardFromStack() {
		return deck.takeCardFromDeck();
	}
	
	
	
	
	

}
