package domain.player.donkey;

import domain.DomainException;
import domain.game.strategies.CardGameStrategy;
import domain.player.DefaultComputerPlayer;
import domain.player.DefaultHumanPlayer;
import domain.player.Score;

public class DonkeyHumanComputerPlayer extends DefaultHumanPlayer {

	public DonkeyHumanComputerPlayer(String name, Score score)
			throws DomainException {
		super(name, score);
		
	}

	

}
