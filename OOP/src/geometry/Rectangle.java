package geometry;

public class Rectangle {

	private int upperLeftX;
	private int upperLeftY;
	private int width;
	private int height;
	private boolean selected;
	
	public int[] rightLowerCorner() {
		int[] rightLowerXY = new int[2];		
		rightLowerXY[0] = this.upperLeftX + this.width;
		rightLowerXY[1] = this.upperLeftY + this.height;		
		return rightLowerXY;
	}
	
	public int getUpperLeftX() {
		return upperLeftX;
	}
	
	public void setUpperLeftX(int upperLeftX) {
		this.upperLeftX = upperLeftX;
	}
	
	public int getUpperLeftY() {
		return upperLeftY;
	}
	
	public void setUpperLeftY(int upperLeftY) {
		this.upperLeftY = upperLeftY;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
