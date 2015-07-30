package domain.player;

import java.util.List;
import java.util.Set;

import domain.DomainException;
import domain.PlayerObserver;
import domain.Subject;
import domain.card.Card;
import domain.game.CardGame;
import domain.game.strategies.CardGameStrategy;

public abstract class Player implements Subject  {
	protected String name;
	protected Score score;
	protected List<Card> hand;
	protected CardGameStrategy gameStrategy;
	
	public Player(String name , Score score) throws DomainException{
		setName(name);
		setScore(score);
	}

	public void setScore(Score score)throws DomainException {
		if(score == null){
			throw new DomainException("No score was given");
		}else{
			this.score = score;
		}
		
	}
	
	public Score getScore(){
		return this.score;
	}
	
	public String getName(){
		return this.name;
	}

	private void setName(String name)throws DomainException {
		if(name == null || name.equals("")){
			throw new DomainException("No name was given");
		}else{
			this.name = name;
		}
		
	}
	
	public void setStack(List<Card> stack){
		this.hand = stack;
	}
	
	public List<Card> getCards(){
		return this.hand;
	}
	
	public void addCard(Card c){
		this.hand.add(c);
	}
	
	
	public void playCard(Card c)throws DomainException{
		if(! this.hand.remove(c)){
			throw new DomainException("Card does not exist.");
		}
		
	}
	
	public CardGameStrategy getCardGameStrategy(){
		return this.gameStrategy;
	}
	
	public abstract void play(CardGame cg, Set<Player> players);
	
	@Override
	public void addObserver(PlayerObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(PlayerObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
	

}
