package domain.player.donkey;

import domain.DomainException;
import domain.card.Card;
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
	
	public int getAmountSameValue(){
		int val = 0;
		int maxVal = 0;
		
		for(int i = 0 ; i < this.hand.size() ; i++){
			if(val > maxVal){
				maxVal = val;
			}
			val = 0;
			for(int j = 0 ; j< this.hand.size(); j++){
				if(this.hand.get(i) == (this.hand.get(j ))){
					val++;
				}
				
				
			}
			
		}
		
		return maxVal;
				
	}
	
	
	
	

	

}
