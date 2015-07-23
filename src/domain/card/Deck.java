package domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> deck;
	
	
	public Deck(){
		createDeck();
	}
	
	private void createDeck() {
		this.deck = getDefaultDeck();
		
		
	}

	private static List<Card> getDefaultDeck(){
		List<Card> defaultCardDeck = new ArrayList<Card>();
		
		// Iterate over Symbols
		for(Symbol s : Symbol.values()){
			// Iterate over Values 
			for(Value v : Value.values()){
				Card c = new Card(v, s);
				defaultCardDeck.add(c);
			}
		}	
		
		return defaultCardDeck;
	}
	
	public List<Card> getDeck(){
		return this.deck;
	}
	
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
	public void addCardToDeck(Card c){
		this.deck.add(this.deck.size(), c);
	}
	
	public Card takeCardFromDeck(){
		return this.deck.remove(0);
	}
	
	
	
	
	
	public List<Card>getCardsFromDeck(int amount){
		List<Card> subdeck = this.deck.subList(0, amount+1);
		for (int i = 0; i < this.deck.size(); i++) {
			this.deck.remove(i);
		}
		return subdeck;
	}
	
	//TODO further implement deck features.


}
