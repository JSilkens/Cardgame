package domain.player;

import java.util.Set;
import java.util.Scanner;
import domain.card.Card;
import domain.DomainException;
import domain.game.CardGame;


//OCP
public class DefaultHumanPlayer extends Player {

	public DefaultHumanPlayer(String name, Score score) throws DomainException {
		super(name, score);
		
	}

	@Override
	public void play(CardGame cg, Set<Player> players) {
		// Toon kaarten en laat player kiezen tussen hit en stand
		for(Card c : getCards()){
			c.toString();
		}
		
		
	}

}
