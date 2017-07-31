package parts;

public class Engine {
	String engineCondition;
	CarParts parts = new CarParts();

	public void engineDetails() {
		System.out.println("<u>Serial Number:</u> MZ237F4893\nModel Number: 1123423\nDate Manufactured: 1/12/2015\n");
		parts.selectParts();
	}

	public String conditions() {
		engineCondition = "overheating";
		return engineCondition;
	}
}
