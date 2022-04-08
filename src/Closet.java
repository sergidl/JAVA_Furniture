public class Closet extends Furniture {
	private float length, width, height;

	public Closet(String name, String material, String color, float length, float width, float height) {
		super(name, material, color);
		this.setLength(length);
		this.setWidth(width);
		this.setHeight(height);
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


	@Override
	public void broken() {
		System.out.println("Closet is broken");
		
	}
}
