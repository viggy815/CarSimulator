package parts;

import actions.Simulator;

public class Conditions {

	public void allConditions(String doors, String engine, String windows, String wheels) {
		Simulator sim = new Simulator();
		System.out.println(
				"\nDoors: " + doors + "\nEngine: " + engine + "\nWindows: " + windows + "\nWheels and Tires: " + wheels+"\n");

		sim.menu();

	}
}
