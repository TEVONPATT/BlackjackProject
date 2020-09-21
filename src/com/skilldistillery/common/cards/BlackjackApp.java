package com.skilldistillery.common.cards;

import java.util.Scanner;

public class BlackjackApp {
	Dealer dealer = new Dealer();
	Player player = new Player();
	Scanner scan = new Scanner(System.in);

//	int user = scan.nextInt();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BlackjackApp bJackApp = new BlackjackApp();
		bJackApp.menu();

//	int user = scanner.nextInt();
//	switch (user) {
//	case 1:
//		bJackApp.startGame();
//		System.out.println();
//		
//		break;
//	case 2:
//		System.out.println("See you later!");
//		break;
//
//	default:
//		System.out.println("Not a valid option. Please try again later.");
//		break;
//	}

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
		int user = scan.nextInt();
		switch (user) {
		case 1:
			gettingStarted();
			System.out.println();

			break;
		case 2:
			System.out.println("See you later!");

		default:
			System.out.println("Not a valid option.");
			break;
		}
	}

	public void gettingStarted() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[]                                     []");
		System.out.println("[]        1) Deal cards                []");
		System.out.println("[]        2) Quit                      []");
		System.out.println("[]                                     []");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int n = scan.nextInt();
		switch (n) {
		case 1:
//		System.out.println();
			dealer.shuffle();
			gamePlay();
			break;
		case 2:
			System.out.println("See you later!");
			break;

		default:
			System.out.println("Not a valid option. PLease try again later.");
			break;
		}
	}
	//TODO find a way to compare dealer and player hand/ loop so that the cards are added automatically.
	//TODO 
	public void gamePlay() {  
//		BlackjackHand bJackHand = new BlackjackHand();
//		dealer.shuffle();
		
		dealer.dealCardToPlayer(player);
		dealer.dealCardToPlayer(player);
		player.showCard();
		System.out.println("");

		dealer.dealCardToDealer(dealer);
		dealer.dealCardToDealer(dealer);
//		dealer.dealerFaceUpCard();
		dealer.dealerCards();
		
		keepPlayingOrNot();
//		int i = 0;
//		if(player(i) < dealer.dealerCards() ) {
//			
//		}
		
//		if(dealer.dealerCards().compareTo(player.showCard()) && player.showCard().compareTo(21)) {
//			System.out.println("YOU WIN!");
//		}
		
	}
	public void keepPlayingOrNot() {
		int n = scan.nextInt();
		System.out.println("Select 1 to hit or select 2 to stay");
		
		switch(n) {
		case 1: 
			while(player.indexOf(player.showCard()) < 2) { //How to loop through and add another card.
				dealer.dealCardToPlayer(player);
			}
		case 2:
			player.showCard();
		}
	}


//public void loop() {
//	Scanner scanner = new Scanner(System.in);
//	
//	int user = scanner.nextInt();
//	switch (user) {
//	case 1:
//		bJackApp.startGame();
//		System.out.println();
//		
//		break;
//	case 2:
//		System.out.println("See you later!");
//		break;
//
//	default:
//		System.out.println("Not a valid option. Please try again later.");
//		break;
//	}
//}
}
