package parts;

import actions.Simulator;

public class Conditions {

	public void allConditions(String doors, String engine, String windows, String wheels) {
		Simulator sim = new Simulator();
		System.out.println(
				"Doors: " + doors + "\nEngine: " + engine + "\nWindows: " + windows + "\nWheels and Tires: " + wheels);

		sim.menu();

	}
}
