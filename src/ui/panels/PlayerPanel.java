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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import domain.PlayerObserver;
import domain.card.Card;
import domain.player.Player;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.donkey.DonkeyController;

public class PlayerPanel extends JPanel implements PlayerObserver {

	GroupLayout groupLayout;

	JLabel lb;
	JButtonCard[] btnCards;
	Player p;

	/**
	 * Create the panel.
	 */
	public PlayerPanel(JPanel panel, Player p) {

		this.lb = new JLabel(p.getName());

		JPanel btnPanel = new JPanel();
		this.groupLayout = new GroupLayout(this);

		/*
		 * groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment
		 * .LEADING) .addGroup( Alignment.TRAILING,
		 * groupLayout.createSequentialGroup()
		 * .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		 * .addComponent(btnPanel, GroupLayout.PREFERRED_SIZE, 450,
		 * GroupLayout.PREFERRED_SIZE)));
		 */
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addComponent(lb)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnPanel, GroupLayout.PREFERRED_SIZE,
								271, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		GridLayout gl = new GridLayout(2, 2);
		btnPanel.setLayout(gl);

		btnCards = new JButtonCard[4];
		for (int i = 0; i < btnCards.length; i++) {
			btnCards[i] = new JButtonCard(p.getCards().get(i));
			btnCards[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					DonkeyController.getInstance().cardPlayed(
							((JButtonCard) e.getSource()).getCard());
				}
			});
			btnPanel.add(btnCards[i]);

		}

		this.p = p;
		this.p.addObserver(this);
	}

	public Player getPlayer() {
		return this.p;
	}

	/**
	 * Update UI
	 */
	@Override
	public void update() {

		for (JButtonCard btn : this.btnCards) {
			btn.setCard(null);
		}

		int i = 0;

		for (Card c : p.getCards()) {

			this.btnCards[i].setCard(c);
			i++;
		}

	}

	@Override
	public void update(Player p) {
		// TODO Auto-generated method stub

	}

	public void setActive(boolean b) {
		if (b == true) {
			this.setBorder(BorderFactory.createLineBorder(Color.red, 10));
			for (JButtonCard btn : btnCards) {
				btn.setEnabled(true);
			}
		} else {
			this.setBorder(null);
			for (JButtonCard btn : btnCards) {
				btn.setEnabled(false);
			}
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
				this.setText(c.toString());
			} else {
				this.setText("");
			}

		}

		public Card getCard() {
			return this.c;
		}

		@Override
		public String toString() {
			return c.toString();
		}

	}

}
