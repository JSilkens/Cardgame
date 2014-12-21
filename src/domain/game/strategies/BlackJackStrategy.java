package domain.game.strategies;

import java.util.Set;

import domain.game.CardGame;
import domain.game.blackjack.BlackJackGame;
import domain.player.Player;

/**
 * 
 * @author johan
 *
 *Defines the AI of that game.
 */

public class BlackJackStrategy implements CardGameStrategy {
	//alle blackjack informatie hier
	private int points ;
	

	@Override
	public void play(CardGame game , Set<Player> players ) {
		BlackJackGame blackjack = (BlackJackGame) game;
		
		if(points < 21 && ){
			
		}
		/**
		 * Vraag naar score currentplayer
		 * Afhankelijk van keuze speler een kaart vragen
		 * 
		 */
		
		
	}
	
	
	

}
