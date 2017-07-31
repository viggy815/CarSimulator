package parts;

import java.util.Scanner;

public class CarParts {

	public String condition;

	public CarParts() {

	}

	public void selectParts() {
		Scanner partsInput = new Scanner(System.in);
		int partsOption;
		System.out.println("Parts Menu:\n1) Engine\n2) Doors\n3) Windows\n4) Wheels and Tires\n5) Main Menu\n6) Exit");
		System.out.println("Select an option");
		partsOption = partsInput.nextInt();
		if (partsOption > 0 || partsOption < 5) {
			while (partsOption > 0 && partsOption < 5) {
				switch (partsOption) {
				case 1:
					System.out.println("parts first option\n");
					selectParts();
					break;
				case 2:
					Doors doors = new Doors();
					doors.mainDoors();

					break;
				}
			}
		} else {
			System.out.println("Please select from the menu");
			selectParts();
		}

	}
}
