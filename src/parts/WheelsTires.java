package parts;

import actions.Simulator;

public class WheelsTires {

	String wheelConditions;
CarParts parts = new CarParts();
	public void wheelDetails() {
		System.out.println("Type: Firestone\nSize: 260/45/R17\nTread: .25\n");
		parts.selectParts();
	}

	public String wheelConditions() {
		wheelConditions = "Will need tires in the next 10,000 miles, back driver rim slightly bent";
		return wheelConditions;
	}
}
