package actions;

import java.util.Scanner;

public class Car {

	public Car() {

	}

	public void run() {
		int runOption;
		System.out.println("Car is running\n");
		System.out.println("Press 0 to turn the car off\n");
		Scanner runInput = new Scanner(System.in);
		runOption = runInput.nextInt();
		if (runOption == 0) {
			System.out.println("Car is turned off, please select from the Main Menu");
			new Simulator().menu();
		} else {
			System.out.println("Please turn the car off by pressing 0 before continuing...");
		}

	}

}
