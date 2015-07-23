package domain.game.strategies;

import java.util.Set;

import domain.card.Card;
import domain.game.CardGame;
import domain.player.Player;

/**
 * 
 * @author johan
 *impmenters must implement this class
 */

public interface CardGameStrategy {
	public void play(CardGame game , Set<Player> players , Player p );
	public int getPoints();
	public boolean isStopped();

}
