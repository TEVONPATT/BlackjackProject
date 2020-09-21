package com.skilldistillery.common.cards;

import java.util.Scanner;

public class BlackjackApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	menu();
	int user = scan.nextInt();
	int n = 0;
	switch (user) {
	case 1:
		startGame();
		System.out.println();
		
		break;
	case 2:
		System.out.println("See you later!");
		break;

	default:
		System.out.println("Not a valid option.");
		break;
	}
}

public static void menu() {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("[]                                     []");
	System.out.println("[] To play select 1. To exit select 2. []");
	System.out.println("[]                                     []");
	System.out.println("[]        1) Play                      []");
	System.out.println("[]        2) Quit                      []");
	System.out.println("[]                                     []");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//	String user = scan.next();
//	int n = 0;
//	switch (user) {
//	case 1:
//		startGame();
//		System.out.println();
//		
//		break;
//	case 2:
//		System.out.println("See you later!");
//
//	default:
//		System.out.println("Not a valid option.");
//		break;
//	}
}

private static void startGame() {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("[]                                     []");
	System.out.println("[]        1) Deal cards                []");
	System.out.println("[]        2) Quit                      []");
	System.out.println("[]                                     []");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	int n = 0;
	switch (n) {
	case 1:
		Dealer.dealCard();
	case 2:
		System.out.println("See you later!");
		break;

	default:
		System.out.println("Not a valid option.");
		break; 
	}
}

}
