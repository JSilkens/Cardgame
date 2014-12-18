package domain.player;

import domain.DomainException;

public class Player {
	private String name;
	private Score score;
	
	public Player(String name , Score score) throws DomainException{
		setName(name);
		setScore(score);
	}

	private void setScore(Score score)throws DomainException {
		if(score == null){
			throw new DomainException("No score was given");
		}else{
			this.score = score;
		}
		
	}

	private void setName(String name)throws DomainException {
		if(name == null || name.equals("")){
			throw new DomainException("No name was given");
		}else{
			this.name = name;
		}
		
	}

}
