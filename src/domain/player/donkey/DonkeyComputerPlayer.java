package domain.player.donkey;

import domain.DomainException;
import domain.game.strategies.CardGameStrategy;
import domain.player.DefaultComputerPlayer;
import domain.player.Score;

public class DonkeyComputerPlayer extends DefaultComputerPlayer {

	public DonkeyComputerPlayer(String name, Score score,
			CardGameStrategy strategy) throws DomainException {
		super(name, score, strategy);
		// TODO Auto-generated constructor stub
	}

}
