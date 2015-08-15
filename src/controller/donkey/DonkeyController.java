package controller.donkey;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import ui.donkey.DonkeyGameUI;
import domain.DomainException;
import domain.card.Card;
import domain.game.CardGame;
import domain.game.donkey.DonkeyGame;
import domain.game.donkey.strategy.DonkeyGameStrategy;
import domain.player.Player;

public class DonkeyController {
	
	// maak spel 
	// maak spelers
	// steek spelers in spel
	// speel het spel
	
	private DonkeyGame game;
	private static DonkeyController instance ;
	//private DonkeyGameStrategy strategy;
	
	public DonkeyController(){
		
	}
	public void createGame(Set<Player> playersArray) throws DomainException{
		
		DonkeyGame dg = new DonkeyGame(playersArray);
		//this.strategy = new DonkeyGameStrategy(playersArray.iterator().next());
		setGame(dg);
		//setStrategy
		
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
	
	public void cardPlayed(Card c){
		//Card heldcard =  game.get;
		System.out.println("test");
	}
	
	public static DonkeyController getInstance(){
		if(instance == null){
			instance = new DonkeyController(); 
		}
		return instance;
	}
	
	
	


}
