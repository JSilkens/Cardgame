package domain.player;

import domain.DomainException;

public class Score {
	int score;
	
	public Score(int score) throws DomainException{
		setScore(score);
	}

	private void setScore(int score)throws DomainException {
		if(score < 0 ){
			throw new DomainException("Score cannot be lower than zero");
		}else{
			this.score = score;
		}
		
	}

}
