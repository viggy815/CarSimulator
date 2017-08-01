package actions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
	Scanner runInput = new Scanner(System.in);

	public Car() {

	}

	public void run() {
		int runOption;
		System.out.println("Car is running\n");
		System.out.println("Press 0 to turn the car off\n");
		try {
			runOption = runInput.nextInt();
			if (runOption == 0) {
				System.out.println("Car is turned off, please select from the Main Menu");
				new Simulator().menu();
			} else {
				System.out.println("Please turn the car off by pressing 0 before continuing...");
			}
		} catch (InputMismatchException ex) {
			System.out.println("Please enter a numeric value that is not a decimal");
			runInput.next();
			run();
		}

	}

}
