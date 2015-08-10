package ui.blackjack;

import java.util.Scanner;
import java.util.Set;

import domain.card.Card;
import domain.game.CardGame;
import domain.game.strategies.BlackJackStrategy;
import domain.game.strategies.CardGameStrategy;
import domain.player.Player;

public class BlackJackCLI extends BlackJackStrategy {

	public BlackJackCLI(Player p) {
		super(p);
		
	}

	Scanner scan = new Scanner(System.in);

	@Override
	public void play(CardGame game, Set<Player> players, Player p) {
		// Toon kaarten en laat player kiezen tussen hit en stand
				for(Card c : p.getCards()){
					c.toString();
				}
				
				System.out.println("Type h to hit or s to Stand");
				System.out.println("Your choise? ");
				
				String choice = scan.next();
				do{
					if (choice.equals("h")){
					p.addCard(game.getCardFromStack());
					}else if(choice.equals("s")){
						setStanded(true);
					}
					
				}while(!choice.equals("s") && ! choice.equals("h"));
				
		
	}

	@Override
	public void run(CardGame game) {
		// TODO Auto-generated method stub
		
	}

}
