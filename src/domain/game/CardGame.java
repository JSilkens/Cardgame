package domain.game;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.DomainException;
import domain.GameObserver;
import domain.GameSubject;
import domain.card.Card;
import domain.card.Deck;
import domain.player.Player;

public abstract class CardGame implements GameSubject {
	protected Deck deck;
	protected Player currentPlayer;
	protected Set<Player> players;
	protected GameObserver gameObserver;

	public CardGame(Set<Player> players) throws DomainException {
		this.deck = createDeck();
		setPlayers(players);
		
	}

	protected void setPlayers(Set<Player> players) throws DomainException {
		if(players.size() > this.getMaxPlayers()-1) throw new DomainException("The max amount of player is reached");
		if(players.size() < this.getMinPlayers()-1) throw new DomainException("You cannot go under the minimum required amount of players");
		this.players = players;
		
	}
	
	public Set<Player> getPlayers(){
		return this.players;
	}
	
	protected void addPlayer(Player p){
		this.players.add(p);
	}
	
	public Player getCurrentPlayer(){
		return this.currentPlayer;
	}
	
	public void setCurrentPlayer(Player p){
		this.currentPlayer = p;
	}
	

	
	
	
	
	public abstract Player getWinner();

	public abstract Deck createDeck();
	public abstract int getMaxPlayers();
	public abstract int getMinPlayers();
	

	public Card getCardFromStack() {
		return deck.takeCardFromDeck();
	}
	
	
	
	
	

}
