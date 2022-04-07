public class Stool extends Chair {
	private boolean foldable;
	public Stool(String name, String material, String color, int numberOfLegs, boolean foldable) {
		super(name, material, color, numberOfLegs);
		this.setFoldable(foldable);
	}

	public boolean getFoldable() {
		return foldable;
	}
	public void setFoldable(boolean foldable) {
		this.foldable = foldable;
	}
	
}
