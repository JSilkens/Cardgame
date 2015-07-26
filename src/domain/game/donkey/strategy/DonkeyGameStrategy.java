package domain.game.donkey.strategy;

import java.util.Set;

import domain.card.Card;
import domain.game.CardGame;
import domain.game.strategies.CardGameStrategy;
import domain.player.Player;
import domain.player.donkey.DonkeyHumanPlayer;


/*
 * TODO 
 * points are the amount of cards of the same value
 * the isBusted function is when the player has the full word
 */

public class DonkeyGameStrategy implements CardGameStrategy {
	private Player p;

	public DonkeyGameStrategy(Player p) {
		 setPlayer(p);
		
	}

	private void setPlayer(Player p) {
		this.p = p;
		
	}

	
	
	public Card swapCard(Player otherplayer){
		return null;
		
	}
	
	

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		
		return p.getScore().getScore();
	}
	
	

	@Override
	public boolean isStopped() {
		// TODO when player has the whole word => game over
		if  (((DonkeyHumanPlayer) p).showLetters().length() == 4){
			return true;
		}
		
		return false;
	}

	@Override
	public void play(CardGame game, Set<Player> players, Player p) {
		game.createDeck();
		while(game.getWinner() == null){
			for(Player pe : players){
				//TODO
				/*
				 * 1 set player active
				 * 2. show his cards
				 * 3. ... 
				 */
			}
			
		}
		
	}

}
