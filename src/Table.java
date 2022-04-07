public class Table extends Furniture{
	private float length, width, height;
	private int numberOfLegs;
	private boolean extendable;

	public Table(String name, String material, String color, float length,
	float width, float height, int numberOfLegs, boolean extendable) {
		super(name, material, color);
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
		this.setNumberOfLegs(numberOfLegs);
		this.setExtendable(extendable);
	}

	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public boolean getExtendable() {
		return extendable;
	}
	public void setExtendable(boolean extendable) {
		this.extendable = extendable;
	}

}
