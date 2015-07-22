package domain.game.donkey;

import java.util.List;
import java.util.Set;

import domain.card.Card;
import domain.game.CardGame;
import domain.player.Player;

public class DonkeyGame extends CardGame {


	/*
	 * Rules
	 * -----
	 * Every player gets 4 random cards from the set.
	 * Every player gets 5 seconds to pass a card to his/her neighbor
	 * If the player was unable to pass his card on time a letter of the word "EZEL" is added
	 * Player loses when he has the whole word.
	 * Game stops when a player has 4 cards of the same value.
	 * 
	 */
	public DonkeyGame(Set<Player> players) {
		super(players);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Player getWinner() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * Every player gets a random set of 4 cards
	 * 
	 */
	@Override
	public List<Card> createDeck() {
		// TODO Auto-generated method stub
		
		return null;
	}
 /*
  * The max players for this game 12
  * Min = 3 
  * @see domain.game.CardGame#getMaxPlayers()
  */
	@Override
	public int getMaxPlayers() {
		
		return 12;
	}


	@Override
	public int getMinPlayers() {
		
		return 3;
	}

}
