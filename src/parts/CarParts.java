package parts;

import java.util.Scanner;

import actions.Simulator;

public class CarParts {
	Scanner partsInput = new Scanner(System.in);
	public String condition;

	public CarParts() {

	}

	public void selectParts() {

		int partsOption;
		System.out.println("Parts Menu:\n1) Engine\n2) Doors\n3) Windows\n4) Wheels and Tires\n5) Main Menu\n6) Exit");
		System.out.println("Select an option\n");
		partsOption = partsInput.nextInt();
		if (partsOption > 0 || partsOption < 7) {
			while (partsOption > 0 && partsOption < 7) {
				switch (partsOption) {
				case 1:
					Engine engine = new Engine();
					engine.engineDetails();
					break;
				case 2:
					Doors doors = new Doors();
					doors.mainDoors();

					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					Simulator sim = new Simulator();
					sim.menu();
					break;
				case 6:
					System.out.println("Thank you for using this application, GoodBye!");
					System.exit(0);
					break;

				}
			}
		} else {
			System.out.println("Please select from the menu");
			selectParts();
		}

	}

}
