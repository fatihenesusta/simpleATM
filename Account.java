package AtmMachine;

import java.util.Date;
import java.util.Scanner;

public class Account {
	private static int userNumber;
	private double initialBalance = 100;
	private double[] accounts;
	Scanner input = new Scanner(System.in);

	public Account() {
		System.out.println("Enter your identification number: ");
		userNumber = input.nextInt();
		accounts = new double[10];
		accounts(initialBalance);
		checkLogin(userNumber);
		balance(accounts, userNumber);

	}

	private void accounts(double initialBalance2) {
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = 100;
		}
	}

	private void balance(double[] accounts2, int userNumber) {
		for (int i = userNumber; i < accounts2.length; i++) {
			if (userNumber == i) {
				System.out.println(accounts2[i]);
			}
		}

	}

	public void checkLogin(int userNumber) {
		if (userNumber >= 1 && userNumber <= 9) {
			gotoMenu();
		} else {
			System.out.println("Invalid entry.");
		}
	}

	private void gotoMenu() {
		System.out.println();
		System.out.println("Welcome to the Main Menu\n" + "---------------\n" + "Press (1) to check balance\n"
				+ "Press (2) for widthdraw menu\n" + "Press (3) for deposit menu\n" + "Press (4) to exit\n"
				+ "Press (5) to change user\n");
		System.out.println("Enter a choice");
		int userChoice = input.nextInt();
		if (userChoice == 1) {
			System.out.print("Your balance is: ");
			balance(accounts, userNumber);
			System.out.print(" $");
			System.out.println("\n---------------");
			gotoMenu();
		}

		if (userChoice == 2) {
			System.out.println();
			System.out.println("Please enter the amount: ");
			double withdrawAmount = input.nextDouble();
			withdraw(withdrawAmount, userNumber);
			System.out.println("---------------");
			System.out.println("Your balance is: ");
			balance(accounts, userNumber);
			System.out.print(" $");
			gotoMenu();
		}

		if (userChoice == 3) {
			System.out.println();
			System.out.println("Please enter the amount: ");
			double depositAmount = input.nextDouble();
			deposit(depositAmount, userNumber);
			System.out.println("---------------");
			System.out.println("Your balance is: ");
			balance(accounts, userNumber);
			System.out.print(" $");
			gotoMenu();
		}

		if (userChoice == 4) {
			System.out.println();
			System.out.println("---------------");
			System.out.println("Your balance is: ");
			balance(accounts, userNumber);
			System.out.print(" $");
			System.out.println("Exiting the bank operation...");
			System.exit(0);
		}

		if (userChoice == 5) {
			System.out.println();
			System.out.println("---------------");
			System.out.println("Changing user...");
			System.out.println("Enter your user identification number: ");
			userNumber = input.nextInt();
			checkLogin(userNumber);
			balance(accounts, userNumber);
		}

		if (userChoice > 5) {
			System.out.println();
			System.out.println("Invalid number entrance, returning to the main menu.");
			System.out.println("---------------");
			gotoMenu();
		}
	}

	private void deposit(double depositAmount, int userNumber2) {
		for (int i = userNumber2; i <= userNumber2; i++) {
			accounts[i] += depositAmount;

		}

	}

	private void withdraw(double withdrawAmount, int userNumber2) {
		for (int i = userNumber2; i <= userNumber2; i++) {
			accounts[i] -= withdrawAmount;

		}
	}
}
