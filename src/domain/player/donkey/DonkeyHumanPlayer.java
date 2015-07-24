package domain.player.donkey;

import domain.DomainException;
import domain.game.strategies.CardGameStrategy;
import domain.player.DefaultComputerPlayer;
import domain.player.DefaultHumanPlayer;
import domain.player.Score;

public class DonkeyHumanPlayer extends DefaultHumanPlayer {
	private static String  word = "EZEL";
	private String letters;

	public DonkeyHumanPlayer(String name, Score score)
			throws DomainException {
		super(name, score);
		
	
		
	}
	
	public void addLetter(){
		this.letters +=  DonkeyHumanPlayer.word.substring(letters.length()+1, letters.length()+1);
	}
	
	public String showLetters(){
		return this.letters;
	}
	
	
	
	

	

}
