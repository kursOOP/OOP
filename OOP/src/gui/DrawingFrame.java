package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class DrawingFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JToggleButton tglbtnPoint = new JToggleButton("Point");
		buttonGroup.add(tglbtnPoint);
		toolBarButtons.add(tglbtnPoint);
		
		JToggleButton tglbtnLine = new JToggleButton("Line");
		buttonGroup.add(tglbtnLine);
		toolBarButtons.add(tglbtnLine);
		
		JToggleButton tglbtnCircle = new JToggleButton("Circle");
		buttonGroup.add(tglbtnCircle);
		toolBarButtons.add(tglbtnCircle);
		
		JToggleButton tglbtnDonut = new JToggleButton("Donut");
		buttonGroup.add(tglbtnDonut);
		toolBarButtons.add(tglbtnDonut);
		
		JToggleButton tglbtnRectangle = new JToggleButton("Rectangle");
		buttonGroup.add(tglbtnRectangle);
		toolBarButtons.add(tglbtnRectangle);
		
		DrawingPanel pnlDrawing = new DrawingPanel();
		contentPane.add(pnlDrawing, BorderLayout.CENTER);
		pnlDrawing.setDrawingFrame(this);
	}

}
