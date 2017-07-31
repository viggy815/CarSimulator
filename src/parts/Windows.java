package parts;

import java.util.Scanner;

public class Windows {
	String windowConditions;
	Scanner windowInput = new Scanner(System.in);
	int options;

	public void windowOptions() {
		System.out.println(
				"Which window would you like to open?\n1) Front Driver\n2) Front Passenger\n3) Back Driver\n4) Back Passenger\n");
		options = windowInput.nextInt();

	}

	public String windowconditions() {
		windowConditions = "No Cracks but passenger front window needs motor";
		return windowConditions;
	}
}
