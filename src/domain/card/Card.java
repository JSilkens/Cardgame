package domain.card;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Card {
	private Value v;
	private Symbol s;
	public Card(Value v, Symbol s) {
		setValue(v);
		setSymbol(s);
		
	}
	
	
	public Value getValue() {
		return v;
	}
	public void setValue(Value v) {
		this.v = v;
	}
	public Symbol getSymbol() {
		return s;
	}
	public void setSymbol(Symbol s) {
		this.s = s;
	}
	
	public static List<Card> getDefaultDeck(){
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

	
	
	
	
	@Override
	public String toString(){
		return getSymbol() + " , " + getValue();
	}
	
	
	
	
	

}
