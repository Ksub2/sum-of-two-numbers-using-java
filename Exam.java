import java.awt.event.*;
import javax.swing.*;

public class Exam {
    Exam() {
        JFrame f = new JFrame("Exam GUI");
        f.setSize(400, 400); // Set size of the frame
        f.setLayout(null); // Set layout manager to null for absolute positioning
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation

        JButton b1 = new JButton("Click");
        b1.setBounds(100, 100, 130, 40); // Set button position and size
        f.add(b1);

        JRadioButton j1 = new JRadioButton("Option A");
        JRadioButton j2 = new JRadioButton("Option B");
        j1.setBounds(100, 150, 130, 30); // Set radio button positions and sizes
        j2.setBounds(100, 180, 130, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(j1);
        bg.add(j2);

        f.add(j1);
        f.add(j2);

        f.setVisible(true); // Make the frame visible
    }

    public static void main(String[] args) {
        new Exam(); // Create an instance of the Exam class
    }
}
