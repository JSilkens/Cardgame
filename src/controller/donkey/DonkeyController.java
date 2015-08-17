package controller.donkey;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import javax.swing.JOptionPane;

import ui.donkey.DonkeyGameUI;
import domain.DomainException;
import domain.card.Card;
import domain.game.CardGame;
import domain.game.donkey.DonkeyGame;
import domain.game.donkey.strategy.DonkeyGameStrategy;
import domain.player.Player;
import domain.player.donkey.DonkeyHumanPlayer;

public class DonkeyController {
	
	// maak spel 
	// maak spelers
	// steek spelers in spel
	// speel het spel
	
	private DonkeyGame game;
	private static DonkeyController instance ;
	//private DonkeyGameStrategy strategy;
	
	protected DonkeyController(){
		
	}
	public void createGame(Set<Player> playersArray) throws DomainException{
		
		DonkeyGame dg = new DonkeyGame(playersArray);
		
		setGame(dg);
		
	}

	private void setGame(DonkeyGame donkeyGame) {
		this.game = donkeyGame;
		
	}
	
	public CardGame getGame(){
		return this.game;
	}
	
	
	
	public void createPlayers(){
		
	}
	
	public DonkeyHumanPlayer getWinner(){
		for(Player p : this.game.getPlayers()){
			System.out.println(((DonkeyHumanPlayer)p).getAmountSameValue());
			if(((DonkeyHumanPlayer) p).getAmountSameValue() == 4){
				return (DonkeyHumanPlayer) p;
			}
		}
		return null;
	}
	

	public void cardPlayed(Card c){
		Card heldCard = game.getHeldCard();
		
		if(heldCard != null){
			this.game.getCurrentPlayer().addCard(heldCard);
		}
		
		
		
		this.game.setHeldCard(c);
		try {
			this.game.getCurrentPlayer().playCard(c);
		} catch (DomainException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getWinner() != null){
			JOptionPane.showMessageDialog(null, getWinner().getName() + " won!");
		}
		this.game.advancePlayer();
		
		
	
		
		
	}
	
	public static DonkeyController getInstance(){
		if(instance == null){
			instance = new DonkeyController(); 
		}
		return instance;
	}
	
	
	


}
