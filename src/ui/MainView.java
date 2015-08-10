package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.donkey.DonkeyController;
import ui.donkey.DonkeyGameUI;
import domain.DomainException;
import domain.game.donkey.DonkeyGame;
import domain.player.Player;
import domain.player.Score;
import domain.player.donkey.DonkeyHumanPlayer;

public class MainView extends JFrame {

	private JPanel contentPane;
	private ActionListener newDonkeyGameAction = new NewGameAction();
	private DonkeyController donkeyController = new DonkeyController();

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(2, 0));
		setContentPane(contentPane);
		// createMenuBar();
		createMenu();
	}

	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenuItem newBlackjackItem = new JMenuItem("Blackjack");
		JMenu gameMenu = new JMenu("Game");
		JMenu newGameMenu = new JMenu("new");
		// JMenuItem newDonkeyGame = new JMenuItem("Donkey");
		newGameMenu.add(newBlackjackItem);
		// newGameMenu.add(newDonkeyGame);

		menuBar.add(gameMenu);
		setJMenuBar(menuBar);

	}

	private void createMenu() {
		JButton btnDonkey = new JButton("Donkey");
		JButton btnBlackjack = new JButton("BlackJack");
		btnDonkey.addActionListener(this.newDonkeyGameAction);
		this.contentPane.add(btnDonkey);
		// this.contentPane.add(btnBlackjack);
	}

	private class NewGameAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
	
			
			try {
				Score defaultScore = new Score(0);
				Player[] playersArray = {
					new DonkeyHumanPlayer("Player A", defaultScore),
					 new DonkeyHumanPlayer("Player B", defaultScore),
					 new DonkeyHumanPlayer("Player C", defaultScore),
					 new DonkeyHumanPlayer("Player D", defaultScore)
				};
				
				donkeyController.createGame(new HashSet<Player>(Arrays.asList(playersArray)));
				DonkeyGameUI dUI = new DonkeyGameUI();
				dUI.setVisible(true);
				MainView.this.contentPane.setVisible(false);
				dUI.initPlayerPanel(donkeyController.getGame().getPlayers());
				MainView.this.setContentPane(dUI);
				
	
			} catch (DomainException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			

		}

	}
}
