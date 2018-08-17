package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
