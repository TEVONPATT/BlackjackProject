package com.skilldistillery.common.cards;

import java.util.Scanner;

public class BlackjackApp {
	Dealer dealer = new Dealer();
	Player player = new Player();
	Scanner scan = new Scanner(System.in);
	int user = scan.nextInt();
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	BlackjackApp bJackApp = new BlackjackApp();
	bJackApp.menu();
	int user2 = scanner.nextInt();
	bJackApp.user2();
	scan.next();
	switch (user) {
	case 1:
		bJackApp.startGame();
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

public void menu() {
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

public void startGame() {
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("[]                                     []");
	System.out.println("[]        1) Deal cards                []");
	System.out.println("[]        2) Quit                      []");
	System.out.println("[]                                     []");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	int n = scan.nextInt(); // TODO change to user input
	switch (n) {
	case 1:
		System.out.println();
		dealer.dealCard(player);
	case 2:
		System.out.println("See you later!");
		break;

	default:
		System.out.println("Not a valid option.");
		break; 
	}
}

}
