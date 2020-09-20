package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.List;

// hold cards
public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();

public Hand(List<Card> cards) {
	super();
	this.cards = cards;
}
	public Hand() {
//		cards = new ArrayList<>(2);
//		for (Suit suit : Suit.values()) {
//			for (Rank rank : Rank.values()) {
//				cards.add(new Card(suit, rank));
//			}
//		}
	}
//	public Hand(List<Card> cards) {
//		// TODO Auto-generated constructor stub
//	}
	public void addCard(Card card) {
		cards.add(card);
	}
	public Card dealCard() {
		return cards.remove(0);
	
	}
	public void clear() {

	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

}
