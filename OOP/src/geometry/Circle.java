package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	private Point center;
	private int radius;

	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		super.selected = selected;
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawOval(center.getX()-radius, center.getY()-radius, 2*radius, 2*radius);
		g.setColor(Color.blue);
		if (selected) {
			g.drawRect(center.getX() - radius - 3, center.getY() - 3, 6, 6);
			g.drawRect(center.getX() + radius - 3, center.getY() - 3, 6, 6);
			g.drawRect(center.getX() - 3, center.getY() - radius - 3, 6, 6);
			g.drawRect(center.getX() - 3, center.getY() + radius - 3, 6, 6);
			g.drawRect(center.getX() - 3, center.getY() - 3, 6, 6);
		}
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

	public String toString() {
		return center+", radius: "+radius;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle) obj;
			return (center.equals(temp.center) && radius == temp.radius);
		}
		else
			return false;
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

	public void setRadius(int radius) throws Exception{
		if(radius < 0)
			throw new Exception("Radius must not be less than 0");
		this.radius = radius;
	}
}
