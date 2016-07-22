package change;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		// User Story #1
		// The user is prompted asking for the price of the item.

		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the total price of the item's purchased? :");
		float cost = keyboard.nextFloat();

		// User Story #2
		// The user is then prompted asking how much money was tendered by the
		// customer.

		System.out.print("How much money was tendered by customer? :");
		float tendered = keyboard.nextFloat();

		makeChange(cost, tendered);
		keyboard.close();

	}

	public static void makeChange(float cost, float tendered) {

		// User Story #3
		// Display an appropriate message if the customer provided too little
		// money or the exact amount.

		if (cost == tendered) {
			System.out.println("Customer paid exact amount, no change neccessary.");
		} else if (cost > tendered) {
			System.out.println("Customer has not produced enough money to pay for purchase.");

			// User Story #4
			// If the amount tendered is more than the cost of the item, display
			// the number of bills and coins that should be given to the
			// customer.

		} else {
			float change = (tendered - cost);
			if (change > 20) {
				int twentyDollarBill = (int) (change / 20);
				change = change % 20;
				System.out.println("twenties: " + twentyDollarBill);
			}
			if (change > 10) {
				int tenDollarBill = (int) (change / 10);
				change = change % 10;
				System.out.println("tens: " + tenDollarBill);
			}
			if (change > 5) {
				int fiveDollarBill = (int) (change / 5);
				change = change % 5;
				System.out.println("fives: " + fiveDollarBill);
			}
			if (change > 1) {
				int oneDollarBill = (int) (change / 1);
				change = change % 1;
				System.out.println("ones: " + oneDollarBill);
			}
			if (change < 1) {
				change = (int) (change * 100);
				if (change > 25) {
					int quarters = (int) (change / 25);
					change = change % 25;
					System.out.println("Quarters: " + quarters);

				}
				if (change > 10) {
					int dimes = (int) (change / 10);
					change = change % 10;
					System.out.println("Dimes: " + dimes);

				}
				if (change > 5) {
					int nickles = (int) (change / 5);
					change = change % 5;
					System.out.println("Nickles: " + nickles);

				}
				if (change < 5) {
					int pennies = (int) change;
					System.out.println("Pennies: " + pennies);

				}
			}
		}
	}

}
