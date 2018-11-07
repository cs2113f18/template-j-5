package practice.solved.buttons;

// File: TestSwing20.java (Module 9b)
//
// Author: Rahul Simha
// Created: October 21, 2000
//
// BorderLayout: all directions.

import java.awt.*;
        import javax.swing.*;

class UglyButtonFrame extends JFrame {

    // Constructor.
    public UglyButtonFrame (int width, int height)
    {
        // On Mac-OS-X, you may add this for the default Java look:
        try {
            UIManager.setLookAndFeel (UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Set the title and other frame parameters.
        this.setTitle ("Button example");
        this.setResizable (true);
        this.setSize (width, height);

        // Extract the contentPane because we'll
        // need to refer to it a couple of times.
        Container cPane = this.getContentPane();

        // Create a Button instance and pass the button
        // label as a parameter to the constructor.
        JButton b = new JButton ("Quit");
        b.setBackground (Color.cyan);

        // Set the layout manager for our Frame.
        cPane.setLayout (new BorderLayout());

        // Add five uglybuttons at the different locations:
        JButton b1 = new JButton ("South Quit");
        b1.setBackground (Color.cyan);
        b1.setForeground (Color.magenta);
        b1.setOpaque (true);
        cPane.add (b1, BorderLayout.SOUTH);

        JButton b2 = new JButton ();
        b2.setBackground (Color.red);
        b2.setFont (new Font ("Serif", Font.PLAIN, 15));
        b2.setText ("North Quit");
        cPane.add (b2, BorderLayout.NORTH);

        JButton b3 = new JButton ("East Quit");
        b3.setBackground (Color.blue);
        cPane.add (b3, BorderLayout.EAST);

        JButton b4 = new JButton ("West");
        b4.setBackground (Color.green);
        cPane.add (b4, BorderLayout.WEST);

        JButton b5 = new JButton ("CENTER");
        b5.setBackground (Color.yellow);
        cPane.add (b5, BorderLayout.CENTER);

        // Show the frame.
        this.setVisible (true);
    }

} // End of class "UglyButtonFrame"


public class UglyButtons {

    public static void main (String[] argv)
    {
        UglyButtonFrame nf = new UglyButtonFrame (300, 200);
    }

}