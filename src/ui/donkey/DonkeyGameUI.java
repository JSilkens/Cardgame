package ui.donkey;



import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JLabel;




import java.awt.Color;

import javax.swing.BorderFactory;


import controller.donkey.DonkeyController;
import domain.GameObserver;
import domain.game.CardGame;
import domain.game.donkey.DonkeyGame;
import domain.player.Player;
import ui.panels.PlayerPanel;


import java.util.ArrayList;

import java.util.List;

public class DonkeyGameUI extends JPanel implements GameObserver {

	// private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	private List<PlayerPanel> playerpanels;

	public DonkeyGameUI() {

		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(new GridLayout(2, 2));

		playerpanels = new ArrayList<PlayerPanel>();

		JLabel lblGameMessage = new JLabel("Game Message");

		// mainPanel.setLayout(gl_mainPanel);

	}

	public void initPlayerPanel(DonkeyController gameController) {
		gameController.getGame().addObserver(this);
		for (Player p : gameController.getGame().getPlayers()) {
			PlayerPanel playerPanel = new PlayerPanel(this, p);
			playerpanels.add(playerPanel);
			playerPanel.setActive(p == gameController.getGame().getCurrentPlayer());
			this.add(playerPanel);
			
		}
		

	}

	@Override
	public void update(CardGame c) {

		for (PlayerPanel playerPanel : this.playerpanels){
			if(c.getCurrentPlayer().getCards().size() <= 3 && c.getCurrentPlayer() == c.getPlayers().iterator().next()){
				c.getCurrentPlayer().addCard(((DonkeyGame) c).getHeldCard());
			}
				playerPanel.update();
				playerPanel.setActive(c.getCurrentPlayer() == playerPanel.getPlayer());
				
		}
		
		
	
			

	}
}
