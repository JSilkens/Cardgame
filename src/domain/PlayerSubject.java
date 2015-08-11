package domain;

public interface PlayerSubject {
	public void addObserver(PlayerObserver observer);
	public void removeObserver(PlayerObserver observer);
	public void notifyObserver();

}
