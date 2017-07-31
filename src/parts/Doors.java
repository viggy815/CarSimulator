package parts;

import java.util.InputMismatchException;
import java.util.Scanner;

import actions.Simulator;

public class Doors extends CarParts {
	String doorConditions;

	public void mainDoors() {
		Scanner doorInput = new Scanner(System.in);
		int doorOption;
		System.out.println("What would you like to do?\n1) Open Doors\n2) Close Doors");
		try {
			doorOption = doorInput.nextInt();
			if (doorOption > 0 && doorOption < 3) {
				switch (doorOption) {
				case 1:
					openDoor();
					break;
				case 2:
					closeAllDoors();
					break;
				}
			} else {
				System.out.println("Please select an option\n");
			}
		} catch (InputMismatchException e) {

		}
	}

	public void openDoor() {
		Scanner scan = new Scanner(System.in);
		int doorOption;
		System.out.println(
				"What door would you like open?\n1) Front Driver\n2) Front Passenger\n3 Back Driver\n4) Back Passenger\n");
		doorOption = scan.nextInt();
		if (doorOption > 0 && doorOption < 5) {
			switch (doorOption) {
			case 1:
				System.out.println("Front Driver Door is open");
				break;
			case 2:
				System.out.println("Front Passenger door is open");
				break;
			case 3:
				System.out.println("Back Driver door is open");
				break;
			case 4:
				System.out.println("Back Passenger door is open");
				break;

			}
		}

	}

	public void closeAllDoors() {
		System.out.println("All doors have been closed\n");
		Simulator mainMenu = new Simulator();
		mainMenu.menu();
	}

	public String doorConditions() {
		doorConditions = "No Dents";
		return doorConditions;
	}
}
