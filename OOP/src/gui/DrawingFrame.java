package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Donut;
import geometry.Rectangle;

import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DrawingFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JToggleButton tglbtnPoint;
	private JToggleButton tglbtnLine;
	private JToggleButton tglbtnCircle;
	private JToggleButton tglbtnDonut;
	private JToggleButton tglbtnRectangle;
	private JToggleButton tglbtnSelect;
	private JButton btnModify;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DrawingFrame frame = new DrawingFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DrawingFrame() {
		setTitle("Drawing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBarButtons = new JToolBar();
		contentPane.add(toolBarButtons, BorderLayout.NORTH);
		
		tglbtnPoint = new JToggleButton("Point");
		buttonGroup.add(tglbtnPoint);
		toolBarButtons.add(tglbtnPoint);
		
		tglbtnLine = new JToggleButton("Line");
		buttonGroup.add(tglbtnLine);
		toolBarButtons.add(tglbtnLine);
		
		tglbtnCircle = new JToggleButton("Circle");
		buttonGroup.add(tglbtnCircle);
		toolBarButtons.add(tglbtnCircle);
		
		tglbtnDonut = new JToggleButton("Donut");
		buttonGroup.add(tglbtnDonut);
		toolBarButtons.add(tglbtnDonut);
		
		tglbtnRectangle = new JToggleButton("Rectangle");
		buttonGroup.add(tglbtnRectangle);
		toolBarButtons.add(tglbtnRectangle);
		
		tglbtnSelect = new JToggleButton("Select");
		buttonGroup.add(tglbtnSelect);
		toolBarButtons.add(tglbtnSelect);
		
		DrawingPanel pnlDrawing = new DrawingPanel();
		contentPane.add(pnlDrawing, BorderLayout.CENTER);
		pnlDrawing.setDrawingFrame(this);
		
		btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pnlDrawing.getSelectedShape() instanceof Donut) {
					DlgDonut dlg = new DlgDonut();
					dlg.setDonut((Donut)pnlDrawing.getSelectedShape());
					dlg.setVisible(true);
				}
				else if(pnlDrawing.getSelectedShape() instanceof Circle) {
					DlgCircle dlg = new DlgCircle();
					dlg.setCircle((Circle)pnlDrawing.getSelectedShape());
					dlg.setVisible(true);
				}
				pnlDrawing.repaint();
			}
		});
		toolBarButtons.add(btnModify);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlDrawing.getShapes().remove(pnlDrawing.getSelectedShape());
				pnlDrawing.repaint();
			}
		});
		toolBarButtons.add(btnDelete);
		
		
	}

	public JToggleButton getTglbtnPoint() {
		return tglbtnPoint;
	}
	public JToggleButton getTglbtnLine() {
		return tglbtnLine;
	}
	public JToggleButton getTglbtnCircle() {
		return tglbtnCircle;
	}
	public JToggleButton getTglbtnDonut() {
		return tglbtnDonut;
	}
	public JToggleButton getTglbtnRectangle() {
		return tglbtnRectangle;
	}
	public JToggleButton getTglbtnSelect() {
		return tglbtnSelect;
	}
}
