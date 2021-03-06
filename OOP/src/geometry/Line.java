package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		super.selected = selected;
	}

	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		g.setColor(Color.blue);
		if (selected) {
			g.drawRect(getStartPoint().getX() - 3, getStartPoint().getY() - 3, 6, 6);
			g.drawRect(getEndPoint().getX() - 3, getEndPoint().getY() - 3, 6, 6);			
		}
	}

	public boolean contains(Point p){
		return ((startPoint.distance(p) + endPoint.distance(p))-length()) <= 3;
	}

	public boolean contains(int x, int y){
		Point temp = new Point(x, y);
		if((startPoint.distance(temp) + endPoint.distance(temp))-length() <= 3)
			return true;
		else
			return false;
	}

	public double length() {
		int dX = this.startPoint.getX()-this.endPoint.getX();
		int dY = this.startPoint.getY()-this.endPoint.getY();
		return Math.sqrt(dX*dX+dY*dY);		
	}

	public String toString() {
		return startPoint + "-->" + endPoint;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line prosledjena = (Line) obj;
			return (startPoint.equals(prosledjena.startPoint) && endPoint.equals(prosledjena.endPoint));
		}
		else
			return false;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
}
