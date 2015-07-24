package domain.game.donkey.strategy;

import java.util.Set;
import domain.game.CardGame;
import domain.game.strategies.CardGameStrategy;
import domain.player.Player;


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

	@Override
	public void play(CardGame game, Set<Player> players, Player p) {
		// TODO Auto-generated method stub

	}
	
	

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return ;
	}

	@Override
	public boolean isStopped() {
		// TODO when player has the whole word => game over
		return false;
	}

}
