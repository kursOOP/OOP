package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape{

	private Point upperLeftPoint;
	private int width;
	private int height;

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), width, height);
		g.setColor(Color.blue);
		if (selected) {
			g.drawRect(upperLeftPoint.getX() - 3, upperLeftPoint.getY() - 3, 6, 6);
			g.drawRect(upperLeftPoint.getX() + width - 3, upperLeftPoint.getY() - 3, 6, 6);
			g.drawRect(upperLeftPoint.getX() - 3, upperLeftPoint.getY() + height - 3, 6, 6);
			g.drawRect(upperLeftPoint.getX() + width  - 3, upperLeftPoint.getY() + height - 3, 6, 6);
		}
	}

	public Point rightLowerCorner() {
		int xRightLowerCorner = this.upperLeftPoint.getX() + this.width;
		int yRightLowerCorner  = this.upperLeftPoint.getY() + this.height;		
		return new Point(xRightLowerCorner, yRightLowerCorner);
	}

	public boolean contains(Point p) {
		return(this.upperLeftPoint.getX() <= p.getX() 
				&& p.getX()<= (this.upperLeftPoint.getX() + width)
				&& this.upperLeftPoint.getY() <= p.getY() 
				&& p.getY()  <= (this.upperLeftPoint).getY() + height);
	}

	public boolean contains(int x, int y) {
		if(this.upperLeftPoint.getX() <= x 
				&& x<= (this.upperLeftPoint.getX() + width)
				&& this.upperLeftPoint.getY() <=y 
				&& y <= (this.upperLeftPoint).getY() + height)
			return true;
		else 
			return false;
	}

	public int area() {
		return width * height;
	}
	public String toString() {
		return upperLeftPoint+", width: "+width+", height: "+height;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle temp = (Rectangle) obj;
			return (upperLeftPoint.equals(temp.upperLeftPoint) && width == temp.width && height == temp.height);
		}
		else
			return false;
	}

	public Point getupperLeftPoint() {
		return upperLeftPoint;
	}

	public void setupperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
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
}
