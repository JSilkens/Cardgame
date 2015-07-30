package domain;

public interface Subject {
	public void addObserver(PlayerObserver observer);
	public void removeObserver(PlayerObserver observer);
	public void notifyObserver();

}
