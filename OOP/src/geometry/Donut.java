package geometry;

public class Donut extends Circle {
	private int innerRadius;

	public boolean contains(int x, int y) {
		Point temp = new Point(x, y);
		return (this.getCenter().distance(temp) <= this.getRadius()) && (this.getCenter().distance(temp) >= innerRadius);
	}  
	
	public boolean contains(Point p) {
		return (this.getCenter().distance(p) <= this.getRadius()) && (this.getCenter().distance(p) >= innerRadius);
	} 
	
	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}
	
	public String toString() {
		return super.getCenter()+", outer radius: "+getRadius()+", inner radius: "+innerRadius;
		// obelezju centar iz super klase se moze pristupiti na nekoliko nacina:
		// super.getCenter()
		// getCenter()
		// this.getCenter()
		
		// ako bismo promenili njegov specifikator pristupa na protected moglo bi i:
		// this.center
		// super.center
		// center
	}
	
	public boolean equals(Donut obj) {
		if(obj instanceof Donut) {
			Donut temp = (Donut) obj;
			return (getCenter().equals(temp.getCenter()) && getRadius() == temp.getRadius() && innerRadius == temp.innerRadius);
		}
		else
			return false;
	}
	
	public int getInnerRadius() {
		return innerRadius;
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
}
