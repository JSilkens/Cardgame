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
import javax.swing.JProgressBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DonkeyGameUI extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public DonkeyGameUI() {
		setTitle("Donkey game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 362);
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		
		JLabel lblGameMessage = new JLabel("Game Message");
		lblGameMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JProgressBar progressBar = new JProgressBar();
		
		JLabel lblTimeRemaining = new JLabel("Time remaining");
		
		JPanel playerOnePanel = new JPanel();
		
		JLabel lblPlayer = new JLabel("Player 1");
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(progressBar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblGameMessage, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addComponent(lblTimeRemaining, Alignment.LEADING))
						.addGroup(gl_mainPanel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblPlayer, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(playerOnePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_mainPanel.setVerticalGroup(
			gl_mainPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblGameMessage)
					.addGap(19)
					.addComponent(lblPlayer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(playerOnePanel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(lblTimeRemaining)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		
		GridBagLayout gbl_playerOnePanel = new GridBagLayout();
		gbl_playerOnePanel.columnWidths = new int[]{0, 0, 0};
		gbl_playerOnePanel.rowHeights = new int[]{0, 0, 0};
		gbl_playerOnePanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_playerOnePanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		playerOnePanel.setLayout(gbl_playerOnePanel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 4, 4);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		playerOnePanel.add(btnNewButton, gbc_btnNewButton);
		mainPanel.setLayout(gl_mainPanel);
		
		
		
		
		
	}
	
	private class CardSelectedAction{
		
	}
}
