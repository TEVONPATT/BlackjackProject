package com.skilldistillery.common.cards;

import java.util.List;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	public int getHandValue() {
//		int bustValue = 22;
		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}

//		for (int i = 0; i < bustValue; i++) {
//			return cards.indexOf(i);
//		}
		return value;

	}

	public boolean isBlackJack() {

		return getHandValue() == 21;
	}

}
