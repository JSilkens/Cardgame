package controller;


import service.CardGameService;
public class NewCardGameAction {
	private CardGameService service;
	
	 public NewCardGameAction(Class c) {
		super();
		setService(service);
		
		
	}

	private void setService(CardGameService service) {
		this.service = service;
		
	}

	

}
