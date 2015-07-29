package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		createMenuBar();
	}
	
	private void createMenuBar(){
		JMenuBar menuBar = new JMenuBar();
		JMenuItem newBlackjackItem = new JMenuItem("Blackjack");
		JMenu gameMenu = new JMenu("Game");
		JMenu newGameMenu = new JMenu("new");
                JMenuItem newDonkeyGame = new JMenuItem("Donkey");
		newGameMenu.add(newBlackjackItem);
                newGameMenu.add(newDonkeyGame);
		
		menuBar.add(gameMenu);
		setJMenuBar(menuBar);
		
		
		
		
	}
        
        public void actionPreformed(){
            
        }

}
