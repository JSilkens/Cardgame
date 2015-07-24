package domain.player;

import java.util.Set;

import domain.DomainException;
import domain.game.CardGame;
import domain.game.strategies.CardGameStrategy;


//OCP
public class DefaultComputerPlayer extends Player {
	
	public DefaultComputerPlayer(String name, Score score, CardGameStrategy strategy) throws DomainException {
		super(name, score);
		setCardGameStrategy(strategy);
	}

	private void setCardGameStrategy(CardGameStrategy strategy) {
		this.gameStrategy = strategy;
		
	}

	@Override
	public void play(CardGame cg, Set<Player> players) {
		this.gameStrategy.play(cg, players, this);
		
		
		
	}

}
