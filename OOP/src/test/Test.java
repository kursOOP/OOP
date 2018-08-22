package test;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

public class Test {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		Point p13 = new Point();

		p2.setX(4);
		p13.setX(4);
		p13.setY(3);

		System.out.println("Udaljenost p1 od p2: "+p1.distance(p2));
		System.out.println("Udaljenost p1 od p13: "+p1.distance(p13));
		System.out.println("Udaljenost p2 od p13: "+p2.distance(p13));

		Point p3 = new Point(5,6);
		System.out.println(p3.getX()+" "+p3.getY()+" "+p3.isSelected()); //false je jer je inicijalizovana na default vrednost boolean-a
		Point p4 = new Point(10,20,true);
		p3.setSelected(p4.isSelected());
		System.out.println(p3.isSelected());
		Point p5 = p3;
		p3.setX(9);
		System.out.println("Xp3: "+p3.getX());
		System.out.println("Xp5: "+p5.getX());
		Point p6 = new Point(p3.getX(), p3.getY(), p3.isSelected());
		p3.setSelected(false); //setujem na false jer je vec bilo true, da bismo uocili razliku
		System.out.println("selected p3: "+p3.isSelected());
		System.out.println("selected p6: "+p6.isSelected());

		/*
		 14. zadatak
		 Za unistavanje ce biti oznacen objekat kreiran pod b. Nakon izvrsavanja instrukcije pod c. 
		 jer nakon toga ne postoji referenca na taj objekat. 
		 Na konzolu ce biti ispisane vrednosti 1 i 1
		 */

		Line l1 = new Line(new Point(), new Point(10, 20));
		// moze i ovako
		// Line l1 = new Line(new Point(0,0), new Point(10, 20));
		l1.getStartPoint().setX(5);
		System.out.println(l1.getStartPoint().getX());
		Line l2 = new Line(p1, p2); // odgovor: hoce jer reference ukazuju na isti objekat
		Circle c1 = new Circle(l2.getEndPoint(), 10);
		System.out.println(c1.getCenter().getX()+" "+c1.getCenter().getY());
		// da se ne pomeri krug pomeranjem linije:
		// Circle c1 = new Circle(new Point(l2.getEndPoint().getX(), l2.getEndPoint().getY()), 10);
		Rectangle s1 = new Rectangle(new Point(0, 0), 20, 20);
		System.out.println(s1.getWidth()+" "+s1.getHeight());
		Rectangle r1 = new Rectangle(new Point(l2.getStartPoint().getX() + l2.getEndPoint().getX(), // x koordinata tacke upperLeftPoint
				c1.getCenter().getX() * p2.getX()), // y koordinata tacke upperLeftPoint
				c1.getRadius(), // width
				c1.getRadius()-3, // height
				!c1.isSelected()); // selected
		System.out.println("xUpperLeftPoint = "+r1.getupperLeftPoint().getX()+
				", yUpperLeftPoint = "+r1.getupperLeftPoint().getY()+
				", width = "+r1.getWidth()+
				", height = "+r1.getHeight()+
				", selected = "+r1.isSelected());
		
		Point p20 = new Point(5,6);
		Line l20 = new Line(new Point(1,1), new Point(10, 20));
		Rectangle r20 = new Rectangle(new Point(0, 0), 50, 100);
		Circle c20 = new Circle(l2.getEndPoint(), 10);
		Donut d20 = new Donut(new Point(100, 100), 10, 5);

		Shape[] shapes = {p20, l20, r20, c20, d20};
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Point) {
				Point temp = (Point) shapes[i];
				System.out.println(temp);
				// u ovom slucaju moglo je i ovako:
				// System.out.println(shapes[i]);
			}
			else if(shapes[i] instanceof Line) {
				Line temp = (Line) shapes[i];
				System.out.println(temp.length());
			}
			else if(shapes[i] instanceof Circle) {
				Circle temp = (Circle) shapes[i];
				System.out.println(temp.area());
			}
			else if(shapes[i] instanceof Donut) {
				Donut temp = (Donut) shapes[i];
				System.out.println(temp.area());
			}
			else if(shapes[i] instanceof Rectangle) {
				Rectangle temp = (Rectangle) shapes[i];
				System.out.println(temp.area());
			}
		}
		
		try {
			c20.setRadius(-10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Continued");
		
		
	}

}
