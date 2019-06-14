package AtmMachine;

import java.util.Date;
import java.util.Scanner;

public class Account {
	private static int userNumber;
	private int id = 0;
	private double balance = 100;

	private Date dateCreated;
	Scanner input = new Scanner(System.in);

	public Account() {
		dateCreated = new Date();
		balance();
		System.out.println("Enter your identification number: ");
		userNumber = input.nextInt();
		checkLogin(userNumber);
	}

	private double[] balance() {
		userNumber = 0;
		double[] account = new double[9];
		for (int i = 0; i < 9; i++) {
			userNumber = i;
			account[i] = 100;
		}
		return account;
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
				+ "Press (2) for widthdraw menu\n" + "Press (3) for deposit menu\n" + "Press (4) to exit\n");
		System.out.println("Enter a choice");
		int userChoice = input.nextInt();
		if (userChoice == 1) {
			System.out.println("Your balance is: " + getBalance() + "$");
			System.out.println("---------------");
			gotoMenu();
		}

		if (userChoice == 2) {
			System.out.println();
			System.out.println("Please enter the amount: ");
			double withdrawAmount = input.nextDouble();
			withdraw(withdrawAmount);
			System.out.println("---------------");
			System.out.println("Your balance is " + getBalance() + "$");
			gotoMenu();
		}

		if (userChoice == 3) {
			System.out.println();
			System.out.println("Please enter the amount: ");
			double depositAmount = input.nextDouble();
			deposit(depositAmount);
			System.out.println("---------------");
			System.out.println("Your balance is: " + getBalance() + "$");
			gotoMenu();
		}

		if (userChoice == 4) {
			System.out.println();
			System.out.println("---------------");
			System.out.println("Your balance is " + getBalance() + "$");
			System.out.println("Exiting the bank operation...");
			System.exit(0);
		}
		
		if (userChoice > 4) {
			System.out.println();
			System.out.println("Invalid number entrance, returning to the main menu.");
			System.out.println("---------------");
			gotoMenu();
		}
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public double[] account(int userNumber) {
		userNumber = 0;
		double[] account = new double[9];
		for (int i = 0; i < 9; i++) {
			userNumber = i;
			account[i] = 100;
		}
		return account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDate() {
		return dateCreated.toString();
	}

	public void withdraw(double w) {
		this.balance -= w;
	}

	public void deposit(double d) {
		this.balance += d;
	}
}
