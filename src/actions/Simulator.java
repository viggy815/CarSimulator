package actions;

import java.util.InputMismatchException;
import java.util.Scanner;

import parts.CarParts;

public class Simulator {
	public static int options = 0;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simulator sim = new Simulator();
		sim.menu();

	}

	public void nothing() {
		System.out.println("nothing");
		menu();
		options = input.nextInt();

	}

	public void something() {
		System.out.println("Something");
		menu();
		options = input.nextInt();
	}

	public void menu() {
		Car carRun = new Car();
		CarParts parts = new CarParts();
		System.out.println("select an option:\n1) Turn Car on\n2) Car Parts\n3) Conditions\n0) Exit");

		try {
			// options = input.nextInt();
			options = input.nextInt();

			if (options > 0 && options < 4) {
				while (options != 0) {

					switch (options) {

					case 1:

						carRun.run();
						break;

					case 2:
						parts.selectParts();
						break;
					case 3:

						break;

					}
				}
			} else if (options == 0) {
				System.out.println("Thank you for using this application! GoodBye!");

			} else {

				System.out.println("Please enter a value between 0 and 4");
			}
		} catch (NumberFormatException e) {
			System.out.println("Please enter a value from 0 to 3");
			menu();
		} catch (InputMismatchException ex) {
			System.out.println("Please enter a numeric value that corresponds with a menu item.");

			input.next();
			menu();

		}

	}

}
