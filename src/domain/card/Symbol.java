package domain.card;

public enum Symbol {
	HEART('♥'),SPADES('♠'),DIAMONDS('♦'),CLUBS('♣');
	
	
	private char c;
	 Symbol(char c){
		this.c = c;
	}
	 
	 public String toString(){
		 return "" + c;
	 }
	
	
	

}
