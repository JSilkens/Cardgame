package controller.donkey;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import ui.donkey.DonkeyGameUI;
import domain.DomainException;
import domain.game.CardGame;
import domain.game.donkey.DonkeyGame;
import domain.game.donkey.strategy.DonkeyGameStrategy;
import domain.player.Player;

public class DonkeyController {
	
	// maak spel 
	// maak spelers
	// steek spelers in spel
	// speel het spel
	
	private CardGame game;
	private DonkeyGameStrategy strategy;
	
	public DonkeyController(){
		
	}
	public void createGame(Set<Player> playersArray) throws DomainException{
		
		DonkeyGame dg = new DonkeyGame(playersArray);
		this.strategy = new DonkeyGameStrategy(p)
		setGame(dg);
		
		//dg.play();
	}

	private void setGame(DonkeyGame donkeyGame) {
		this.game = donkeyGame;
		
	}
	
	public CardGame getGame(){
		return this.game;
	}
	
	
	
	public void createPlayers(){
		
	}
	


}
