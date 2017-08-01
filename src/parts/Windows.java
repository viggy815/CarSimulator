package parts;

import java.util.InputMismatchException;
import java.util.Scanner;

import actions.Simulator;

public class Windows {
	String windowConditions;
	Scanner windowInput = new Scanner(System.in);
	int options;

	public void windowOptions() {
		System.out.println(
				"Which window would you like to open?\n1) Front Driver\n2) Front Passenger\n3) Back Driver\n4) Back Passenger\n5) Window Details\n6) Close all windows\n7) Main Menu\n8) Exit\n");
		try{
			options = windowInput.nextInt();
			if(options > 0 && options <9){
				switch(options){
				case 1:
					System.out.println("The Front Driver window is open\n");
					windowOptions();
					break;
				case 2:
					System.out.println("The Front Passenger window is open\n");
					windowOptions();
					break;
				case 3:
					System.out.println("The Back Driver window is open\n");
					windowOptions();
					break;
				case 4:
					System.out.println("The Back Passenger window is open\n");
					windowOptions();
					break;
				case 5:
					windowsDetails();
					break;
				case 6:
					System.out.println("All windows have been closed\n");
					 break;
				case 7:
					Simulator sim = new Simulator();
					sim.menu();
					break;
				case 8:
					System.out.println("Thank you for using this applicaiton! GoodBye!");
					System.exit(0);
					break;
				}
			}
			
		}catch(InputMismatchException ex){
			System.out.println("Please select a value from the available options");
			windowInput.next();
			windowOptions();
		}
		

	}

	private void windowsDetails() {
		System.out.println("Maker: Invisible Glass\n Warrenty: 2 years\n Tinted: Yes\n Tint %: 15%");
		windowOptions();
	}

	public String windowconditions() {
		windowConditions = "No Cracks but passenger front window needs motor";
		return windowConditions;
	}
}
