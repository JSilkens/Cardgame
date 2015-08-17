package domain;

public interface GameSubject {
	public void addObserver(GameObserver observer);
	public void removeObserver();
	
}
