package domain.game;

import java.util.HashSet;
import java.util.Set;

import domain.DomainException;
import domain.card.Card;

public abstract class Cardgame {
	private Set<Card> cards;

	public Cardgame() {
		this.cards = new HashSet<Card>();
	}

	public void add(Card c) throws DomainException {
		if (c == null) {
			throw new DomainException("No card was given to the game");
		} else {
			this.cards.add(c);
		}

	}
	
	public abstract void createDeck();
	
	
	
	

}
