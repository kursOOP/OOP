package gui;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import geometry.Line;
import geometry.Point;
import geometry.Shape;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private DrawingFrame drawingFrame;
	private Point startPoint;
	private Shape selectedShape;
	/**
	 * Create the panel.
	 */
	public DrawingPanel() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent clickedPlace) {
				if(drawingFrame.getTglbtnPoint().isSelected()) {
					Point p = new Point(clickedPlace.getX(), clickedPlace.getY());
					shapes.add(p);
				}
				else if(drawingFrame.getTglbtnLine().isSelected()) {
					if(startPoint == null) {
						startPoint = new Point(clickedPlace.getX(), clickedPlace.getY());
					}
					else {
						Point endPoint = new Point(clickedPlace.getX(), clickedPlace.getY());
						Line l = new Line(startPoint, endPoint);
						shapes.add(l);
						startPoint = null;
					}
				}
				else if(drawingFrame.getTglbtnCircle().isSelected()) {
					DlgCircle dlg = new DlgCircle();
					dlg.getTxtX().setText(String.valueOf(clickedPlace.getX()));
					dlg.getTxtY().setText(String.valueOf(clickedPlace.getY()));
					dlg.setVisible(true);
					shapes.add(dlg.getCircle());
				}
				else if(drawingFrame.getTglbtnDonut().isSelected()) {
					DlgDonut dlg = new DlgDonut();
					dlg.getTxtX().setText(String.valueOf(clickedPlace.getX()));
					dlg.getTxtY().setText(String.valueOf(clickedPlace.getY()));
					dlg.setVisible(true);
					shapes.add(dlg.getDonut());
				}
				else if(drawingFrame.getTglbtnRectangle().isSelected()) {
					DlgRectangle dlg = new DlgRectangle();
					dlg.getTxtX().setText(String.valueOf(clickedPlace.getX()));
					dlg.getTxtY().setText(String.valueOf(clickedPlace.getY()));
					dlg.setVisible(true);
					shapes.add(dlg.getRectangle());
				}
				else if(drawingFrame.getTglbtnSelect().isSelected()) {
					Iterator<Shape> it = shapes.iterator();
					selectedShape = null;
					while(it.hasNext()) {
						Shape s = it.next();
						s.setSelected(false);
						if(s.contains(clickedPlace.getX(), clickedPlace.getY())) {
							selectedShape = s;
						}
					}
					if(selectedShape != null)
						selectedShape.setSelected(true);
				}
				repaint();
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			Shape s = it.next();
			s.draw(g);
		}
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

	public Shape getSelectedShape() {
		return selectedShape;
	}

	public void setSelectedShape(Shape selectedShape) {
		this.selectedShape = selectedShape;
	}

}
