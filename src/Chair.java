public class Chair extends Furniture {
	private int numberOfLegs;

	public Chair(String name, String material, String color, int numberOfLegs) {
		super(name, material, color);
		this.setNumberOfLegs(numberOfLegs);
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public void broken() {
		System.out.println("Chair is broken");
		
	}
}
