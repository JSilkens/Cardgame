package domain.game.blackjack;

import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Set;

import domain.card.Card;
import domain.card.Value;
import domain.game.CardGame;
import domain.game.strategies.BlackJackStrategy;
import domain.player.Player;
// Coordination of game

/**
 * 
 * @author johan
 * 
 * TODO Implement play rules
 * - if higher than 21 stop game
 * - if you have more than 7 cards
 * - 
 * - ... etc
 *
 */
public class BlackJackGame extends CardGame {

	public BlackJackGame(Set<Player> players) {
		super(players);
		
	}
	public static int getPoints(Card c, int currentPoints){
		//if card is King , Queen or Jack return 10
		if(c.getValue() == Value.JACK || c.getValue() == Value.QUEEN || c.getValue() == Value.KING  ){
			return 10;
		}
		// if card has value between 2 and 10 return their own value
		if(c.getValue().ordinal()<= Value.TWO.ordinal() || c.getValue().ordinal()>= Value.TEN.ordinal()  ){
			return  c.getValue().ordinal();
		}
		// if card has value 1 (if lower or equal than 10 ==> 11 else 1)
		if(c.getValue().ordinal() == 1 ){
			if (currentPoints <= 10){
				return 11;
			}else{
				return 1;
			}
		}
		
		return 0;
	}

	@Override
	public List<Card> createDeck() {
		
		List<Card> cards = Card.getDefaultDeck();
		Collections.shuffle(cards);
		return cards;
	}

	@Override
	public int getMaxPlayers() {
	
		return 2;
	}
	@Override
	public Player getWinner() {
		int stopped = 0;
		int smallestDifference = 0 , pIn = 0; //smallest difference and the player's index  
		//itereer over alle spelers om hun punten te weten
		for(Player p : players){
			if( ((BlackJackStrategy) p.getCardGameStrategy()).isStopped() == true){		
				stopped++;
			}
		}
		if (stopped == players.size()){
			// spel is afgelopen. Kijk wie er gewonnen heeft
			for(int i = 0 ; i < players.size() ; i++)){
				BlackJackStrategy strategy = (BlackJackStrategy) players..getCardGameStrategy();
				if( (21 - strategy.getPoints()) < smallestDifference ){
					i = pIn;
					
				}
			}
			
			
			
			
			
			
		}	
		return null;
	}
	
	

}
