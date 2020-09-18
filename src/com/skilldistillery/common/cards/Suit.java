package com.skilldistillery.common.cards;

public enum Suit {
HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamond");
	private String name;

	private Suit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
