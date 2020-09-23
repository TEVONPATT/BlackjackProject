package com.skilldistillery.common.cards;

public class Player {
	protected BlackjackHand bJackHand;
	public Player() {
		bJackHand = new BlackjackHand();
	}
	
	public void playerHand(Card[] cards) {
		for(int i = 0; i < cards.length; i++) {
			System.out.println(cards[i]);
		}
	}
	public void add_Card_To_Hand(Card newCard) {
		bJackHand.addCard(newCard);
		bJackHand.getHandValue();
	}
	public void showCard() {
//		bJackHand.toString();
		System.out.println("Player Black Jack Hand: " + bJackHand.toString());
		System.out.println("Your card value: " + bJackHand.getHandValue());
	}

	public int getValue() {
		
		return bJackHand.getHandValue();
	}
	
}
