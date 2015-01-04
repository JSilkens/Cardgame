package domain.game.strategies;

import domain.player.Player;

//definieert de mogelijkheden van het spel
public abstract class BlackJackStrategy implements CardGameStrategy {
	protected int points ;
	 private boolean isStanded;
	 private Player p;
	
	
	public BlackJackStrategy(Player p){
		setPlayer(p);
	}
	private void setPlayer(Player p) {
		this.p = p;
		
	}
	public boolean hasStand(){
		return isStanded;
	}
	public void setStanded(boolean b){
		this.isStanded = b;
	}
	
	public boolean isStopped(){
		if(isStanded == true || isBusted() ){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isBusted(){
		if(p.getCards().size() > 7 && points > 21){
			return true;
		}else{
			return false;
		}
	}
	public int getPoints() {
		
		return points;
	}
	
	
	
	
	
}
