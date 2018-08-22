package geometry;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	private ArrayList<Shape> shapes = new ArrayList<Shape>();;

	public static void main(String[] args) {
		JFrame window = new JFrame("Paint");
		window.setSize(800, 600);
		Drawing drawing = new Drawing();
		window.getContentPane().add(drawing);
		window.setVisible(true);

		Point p20 = new Point(5,6);
		Line l20 = new Line(new Point(10,10), new Point(100, 15));
		Rectangle r20 = new Rectangle(new Point(120,5), 50, 100);
		Circle c20 = new Circle(new Point(230, 60), 50);
		Donut d20 = new Donut(new Point(400, 80), 60, 30);

		drawing.shapes.add(p20);
		drawing.shapes.add(l20);
		drawing.shapes.add(r20);
		drawing.shapes.add(c20);
		drawing.shapes.add(d20);
	}

	public void paint(Graphics g) {
		super.paint(g);
		/*
		shapes.get(2).draw(g);
		shapes.get(shapes.size()-1).draw(g);
		shapes.remove(1);
		shapes.get(1).draw(g);
		shapes.get(3).draw(g);
		 */

		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			Shape temp = it.next();
			/*if(temp instanceof Circle || temp instanceof Rectangle) {
				temp.draw(g);
			}*/
			temp.setSelected(true);
			temp.draw(g);
		}
	}
}
