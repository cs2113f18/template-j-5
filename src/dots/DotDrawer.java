package dots;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import util.*;

/**
 * Created by timwood on 11/9/16.
 */
public class DotDrawer extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = -5176170979783243427L;

	/** The Dot Panel object you will draw to */
	protected static DotPanel dp;
	ArrayList<Dot> dots;

	/* Define constants using static final variables */
	public static final int MAX_X = 100;
	public static final int MAX_Y = 100;
	private static final int DOT_SIZE = 6;


	public DotDrawer() {
		this.setSize(MAX_X * DOT_SIZE, MAX_Y * DOT_SIZE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Dots!");

		/* Create and set the size of the panel */
		dp = new DotPanel(MAX_X, MAX_Y, DOT_SIZE);

		/* Add the panel to the frame */
		Container cPane = this.getContentPane();

		cPane.setLayout(new BorderLayout());
		cPane.add(dp);
		JButton button = new JButton("Button Test!");
		cPane.add(button, BorderLayout.SOUTH);
		button.addActionListener(this);
		dp.addMouseListener(this);

		/* Initialize the DotPanel canvas:
		 * You CANNOT draw to the panel BEFORE this code is called.
		 * You CANNOT add new widgets to the frame AFTER this is called.
		 */
		this.pack();
		dp.init();
		dp.clear();
		dp.setPenColor(Color.red);
		this.setVisible(true);

		dots = new ArrayList<Dot>();

		while(true)
		{
			dp.clear();
			for(Dot d: dots) {
				d.draw(dp);
			}
			dp.repaintAndSleep(33);
		}

	}

	public static void main(String[] args) {
		new DotDrawer();
	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		Color randColor = Color.getHSBColor((float)Helper.nextDouble(), (float)Helper.nextDouble(), (float)Helper.nextDouble());
		int x,y;
		x = Helper.nextInt(MAX_X);
		y = Helper.nextInt(MAX_Y);
		dots.add(new Dot(x, y, randColor));
		System.out.println("New dot at dot coordinate: " + x + ", " + y);
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("Clicked at screen coordinate: " + mouseEvent.getX() + ", " + mouseEvent.getY());
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}
}
