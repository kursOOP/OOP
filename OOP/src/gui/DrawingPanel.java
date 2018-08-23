package gui;

import java.util.ArrayList;

import javax.swing.JPanel;

import geometry.Shape;

public class DrawingPanel extends JPanel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private DrawingFrame drawingFrame;
	/**
	 * Create the panel.
	 */
	public DrawingPanel() {

	}
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	public DrawingFrame getDrawingFrame() {
		return drawingFrame;
	}
	public void setDrawingFrame(DrawingFrame drawingFrame) {
		this.drawingFrame = drawingFrame;
	}

}
