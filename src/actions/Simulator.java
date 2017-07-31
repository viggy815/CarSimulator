package actions;

import java.util.InputMismatchException;
import java.util.Scanner;

import parts.CarParts;
import parts.Conditions;
import parts.Doors;
import parts.Engine;
import parts.WheelsTires;
import parts.Windows;

public class Simulator {
	public static int options = 0;
	public static Scanner input = new Scanner(System.in);
	Car carRun = new Car();
	CarParts parts = new CarParts();
	Conditions condition = new Conditions();
	Doors doors = new Doors();
	Engine engine = new Engine();
	Windows windows = new Windows();
	WheelsTires wheels = new WheelsTires();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simulator sim = new Simulator();
		sim.menu();

	}

	public void menu() {

		System.out.println("Select an option:\n1) Turn Car on\n2) Car Parts\n3) Conditions\n0) Exit");

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

						condition.allConditions(doors.doorConditions(), engine.conditions(), windows.windowconditions(),
								wheels.wheelConditions());
						break;

					}
				}
			} else if (options == 0) {
				System.out.println("Thank you for using this application! GoodBye!");
				System.exit(0);

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
