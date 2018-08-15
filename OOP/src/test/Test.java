package test;

import geometry.Point;

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
	}

}
