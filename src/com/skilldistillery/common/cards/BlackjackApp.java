package com.skilldistillery.common.cards;

import java.time.LocalDate;
import java.time.Month;
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
			break;

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

	// TODO Stop show dealer value before end of game
	// TODO Show value of player hand at end of game.
	// TODO exception out of bounds when dealer has more than 21.
	
	public void gamePlay() {
//		BlackjackHand bJackHand = new BlackjackHand();
//		dealer.shuffle();

		dealer.dealCardToPlayer(player);
		dealer.dealCardToPlayer(player);
		player.showCard();
		System.out.println("Your card value: " + player.getValue());
		System.out.println(" ");

		dealer.dealCardToDealer(dealer);
		dealer.dealCardToDealer(dealer);
		dealer.dealerFaceUpCard();
		System.out.println(" ");
//		System.out.println(keepPlayingOrNot());
//		int playerValue = (player).getValue();
//		int dealer.get = ((Dealer) dealer).getValue();
//		
//	
		OUTER: if (player.getValue() < 21) {
			System.out.println("Select 1 to hit or select 2 to stay");

//		int playerValue = ((Player) player).getValue();
//		int dealerValue = ((Dealer) dealer).getValue();
			int n = scan.nextInt();
			switch (n) {
			case 1:
				// How to loop through and add another card.
				dealer.dealCardToPlayer(player);
				player.showCard();
				dealer.dealerFaceUpCard();
				break OUTER;
			case 2:
				player.showCard();
				dealer.dealerFaceUpCard();
				break OUTER; 
			default:
				System.out.println("Not a valid option");
				break;
			}
		}
			if (player.getValue() > 21) {
				
				System.out.println("!!BUST!!");
			}

	
		while (dealer.getValue() <= 16) {
			player.showCard();
			System.out.println(player.getValue());
			
			dealer.dealCardToDealer(dealer);
			dealer.dealerFaceUpCard();
		if (player.getValue() < dealer.getValue() || dealer.getValue() == 21) {
			System.out.println("You Lose!");
			player.showCard();
			System.out.println(player.getValue());
			dealer.dealerCards();

		} else if(dealer.getValue() == 21) {
			System.out.println("You Lose!");
			player.showCard();
			System.out.println(player.getValue());
			dealer.dealerCards();
		}
		else if (player.getValue() > dealer.getValue() || dealer.getValue() > 21) {
			System.out.println("You Win!");
			player.showCard();
			System.out.println(player.getValue());
			dealer.dealerCards();
		}
	}
		
}

//	public void keepPlayingOrNot() {
////		System.out.println("Select 1 to hit or select 2 to stay");
//		int playerValue = ((Player) player).getValue();
//		int dealerValue = ((Dealer) dealer).getValue();
//
//		int n = scan.nextInt();
//		while (playerValue < 21) {
//			if (playerValue < dealerValue) {
//				System.out.println("Select 1 to hit or select 2 to stay");
//
//			} else if (playerValue > dealerValue) {
//				System.out.println("You Win!");
//			}
//		}
//		while (playerValue > 21) {
//			System.out.println("!!BUST!!");
//		}
//
////		int playerValue = ((Player) player).getValue();
////		int dealerValue = ((Dealer) dealer).getValue();
//		switch (n) {
//		case 1:
//			// How to loop through and add another card.
//			
//			dealer.dealCardToPlayer(player);
//			break;
//		case 2:
//			player.showCard();
//			break;
//		default:
//			System.out.println("Not a valid option");
//			break;
//		}
//	}

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
