package ui.panels;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import domain.PlayerObserver;
import domain.card.Card;
import domain.player.Player;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PlayerPanel extends JPanel implements PlayerObserver {

	GroupLayout groupLayout;

	JLabel lb;
	JButtonCard[] btnCards;

	

	/**
	 * Create the panel.
	 */
	public PlayerPanel(JPanel panel, Player p) {

		this.lb = new JLabel(p.getName());

		JPanel btnPanel = new JPanel();

		this.groupLayout = new GroupLayout(this);
		
		/*
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(
						Alignment.TRAILING,
						groupLayout.createSequentialGroup()
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnPanel,
										GroupLayout.PREFERRED_SIZE, 450,
										GroupLayout.PREFERRED_SIZE)));*/
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(
				groupLayout.createSequentialGroup()
						.addComponent(lb)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE,
								271, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		GridLayout gl = new GridLayout(2, 2);
		btnPanel.setLayout(gl);
		int i = 0;
		btnCards = new JButtonCard[4];
		for (JButtonCard b : btnCards) {
			b = new JButtonCard(p.getCards().get(i++));
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			btnPanel.add(b);
			
		}

	}

	/**
	 * Update UI
	 */
	@Override
	public void update(Player p) {
		int i = 0;
		for (Card c : p.getCards()) {
			this.btnCards[i].setCard(c);
			i++;
		}

	}
	
	public void setActive(boolean b){
		if(b == true){
			this.setBorder(BorderFactory.createLineBorder(Color.red, 10));
		}else{
			this.setBorder(null);
		}
	}

	public class JButtonCard extends JButton {
		
		private static final long serialVersionUID = 1L;
		Card c;

		public JButtonCard(Card c) {
			setCard(c);

		}

		public void setCard(Card c) {
			if (c == null) {
				this.setEnabled(false);
			} else {
				this.setEnabled(true);
			}
			this.c = c;

			if (this.c != null) {
				this.setText(c.getSymbol() + " " + c.getValue());
			} else {
				this.setText("");
			}

		}

	}

}
