package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import service.CardGameService;
public class NewCardGameAction {
	private CardGameService service;
	
	 public NewCardGameAction(Class c) {
		super(c.getName());
		setService(service);
		
		
	}

	private void setService(CardGameService service) {
		this.service = service;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
	}

}
