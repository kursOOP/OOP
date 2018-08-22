package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		super.selected = selected;
		// u nasem slucaju moze i 
		// this.selected = selected;
		// setSelected(selected);
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y+2, x, y-2);
		g.setColor(Color.blue);
		if (selected)
			g.drawRect(this.x - 3, this.y - 3, 6, 6);
	}

	public boolean contains(Point p) {
		return p.distance(new Point(x, y)) <= 3;
	}

	public boolean contains(int x, int y) {
		if(this.distance(new Point(x, y)) <= 3)
			return true;
		else
			return false;
	}

	public double distance(Point p) {
		int dX = x - p.x;
		int dY = p.y - y;
		double d = Math.sqrt(dX*dX + dY*dY);
		return d;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point temp = (Point)obj;
			if (x == temp.x &&	y == temp.y) 
				return true;
			else 
				return false;

		} else 
			return false;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
