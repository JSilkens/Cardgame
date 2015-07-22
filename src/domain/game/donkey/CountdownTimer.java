package domain.game.donkey;

import java.util.Timer;
import java.util.TimerTask;

import domain.DomainException;

public class CountdownTimer {
	int _seconds;
	static Timer _timer;
	
	public CountdownTimer(int seconds) throws DomainException{
		setTimer(seconds);
	}
	
	
	private void setTimer(int seconds) throws DomainException {
		if(seconds <=0){
			throw new DomainException("Seconds cannot be less or equal to 0");
		}else{
			this._seconds = seconds;
		
		}
	}
	
	private final int setInterval(){
		if(_seconds == 1 ){
			this._timer.cancel();
		}
		return -- _seconds;
	}

}
