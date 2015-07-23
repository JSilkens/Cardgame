package domain.game.strategies;

import java.util.Set;

import domain.card.Card;
import domain.game.CardGame;
import domain.game.blackjack.BlackJackGame;
import domain.player.Player;

/**
 * 
 * @author johan
 *
 *Defines the AI of that game.
 */

public class BlackJackAI extends BlackJackStrategy {
	//alle blackjack informatie hier
	
	

	public BlackJackAI(Player p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(CardGame game , Set<Player> players, Player p ) {
		BlackJackGame blackjack = (BlackJackGame) game;
		
		if(points < 21 && p.getCards().size() < 7 ){
			
			Card c = game.getCardFromStack();
			
			 points += blackjack.getPoints(c, points);
			 
			p.addCard(game.getCardFromStack());
			
		}
		/**
		 * Vraag naar score currentplayer
		 * Afhankelijk van keuze speler een kaart vragen
		 * 
		 */
		
		
	}
	
	
	

}
