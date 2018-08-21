package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame window = new JFrame("Paint");
		window.setSize(800, 600);
		Drawing drawing = new Drawing();
		window.getContentPane().add(drawing);
		window.setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
	}
}
