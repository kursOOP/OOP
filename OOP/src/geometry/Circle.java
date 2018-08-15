package geometry;

public class Circle {
	private int centerX;
	private int centerY;
	private int radius;
	private boolean selected;
	
	public boolean conatains(int x, int y) {
		int dx = this.centerX - x;
		int dy = this.centerY - y;
		double d = Math.sqrt(dx * dx + dy * dy);
//		if (d <= this.radius)
//			return true;
//		else
//			return false;
		return (d <= this.radius);
	}
	
	public double area() {
		return Math.PI*this.radius*this.radius;		
	}
	
	public int getCenterX() {
		return centerX;
	}
	
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	
	public int getCenterY() {
		return centerY;
	}
	
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
