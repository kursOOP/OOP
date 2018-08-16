package geometry;

public class Circle {
	private Point center;
	private int radius;
	private boolean selected;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}

	public boolean contains(Point p) {
		return (center.distance(p) <= this.radius);
	}

	public boolean contains(int x, int y) {
		Point temp = new Point(x, y);
		return this.contains(temp);
	}


	public double area() {
		return Math.PI*this.radius*this.radius;		
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
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
