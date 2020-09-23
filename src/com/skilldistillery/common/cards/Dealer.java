package com.skilldistillery.common.cards;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class Dealer extends Player{
	private Deck deck;
//give player 2 cards from deck
//deals two cards to self
	public Dealer() {
		deck = new Deck();
	}
//	public void add_Card_To_Hand(Card newCard) {
//		bJackHand.addCard(newCard);
//		bJackHand.getHandValue();
//	}
		
//	
	public void dealCardToPlayer(Player player) {
		Card newCard = deck.dealCard();
		player.add_Card_To_Hand(newCard);
	}
	public void dealCardToDealer(Dealer dealer) {
		Card newCard = deck.dealCard();
		dealer.add_Card_To_Hand(newCard);
	}
	public void shuffle() {
		deck.shuffle();
	}
	public void showCard() {
		bJackHand.toString();
		System.out.println("Dealer Black Jack Hand: " + bJackHand.toString());
	}

	public void dealerCards() {
//		bJackHand.toString();
		System.out.println("Dealer hand: " + bJackHand.toString());
		System.out.println("Dealer card value: " + bJackHand.getHandValue());
	}
	public void dealerFaceUpCard() {
		
		System.out.println("Dealer card faced up: " +
				bJackHand.cards.get(1).toString());
		System.out.println("Dealer card value: " + bJackHand.cards.get(1).getValue());
	}	
public int getValue() {
		
		return bJackHand.getHandValue();
	}
		
		
//		cards = new ArrayList<>(2);
//		for (Suit suit : Suit.values()) {
//			for (Rank rank : Rank.values()) {
//				cards.add(new Card(suit, rank));
//			}
//		
}
