package ui.donkey;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JSplitPane;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controller.donkey.DonkeyController;
import domain.GameObserver;
import domain.game.CardGame;
import domain.game.donkey.DonkeyGame;
import domain.player.Player;
import ui.panels.PlayerPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Set;

public class DonkeyGameUI extends JPanel implements GameObserver {

	// private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DonkeyGameUI() {

		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(new GridLayout(2, 2));

		JLabel lblGameMessage = new JLabel("Game Message");

		// mainPanel.setLayout(gl_mainPanel);

	}

	public void initPlayerPanel(DonkeyController gameController) {

		for (Player p : gameController.getGame().getPlayers()) {
			PlayerPanel playerPanel = new PlayerPanel(this, p);

			playerPanel.setActive(p.equals(gameController.getGame().getCurrentPlayer()));
			this.add(playerPanel);

		}

	}

	private class CardSelectedAction {

	}

	@Override
	public void update(CardGame c) {

		for (Player p : c.getPlayers()) {
			for (PlayerPanel playerPanel : (PlayerPanel[]) this.getComponents())
				playerPanel.setActive(p.equals(c.getCurrentPlayer()));
		}

	}
}
