abstract class Furniture {
	private String name, material, color;

	public Furniture(String name, String material, String color) {
		this.setName(name);
		this.setMaterial(material);
		this.setColor(color);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
