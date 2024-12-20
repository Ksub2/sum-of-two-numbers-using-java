import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Question extends JFrame implements ActionListener {
    private JTextField t1, t2, t3; // Declare fields to be used in multiple methods
    private JButton b1;

    public Question() {
        // Initialize and set properties for components
        JLabel l1 = new JLabel("First number");
        l1.setBounds(20, 10, 100, 20);

        t1 = new JTextField(10);
        t1.setBounds(120, 10, 100, 20);

        JLabel l2 = new JLabel("Second number");
        l2.setBounds(20, 40, 100, 20);

        t2 = new JTextField(10);
        t2.setBounds(120, 40, 100, 20);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(20, 70, 100, 20);

        t3 = new JTextField(10);
        t3.setBounds(120, 70, 100, 20);
        t3.setEditable(false); // Result field should not be editable

        // Add components to the frame
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        // Add and configure the button
        b1 = new JButton("Sum");
        b1.setBounds(120, 100, 80, 20);
        add(b1);
        b1.addActionListener(this);

        // Set frame properties
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                t3.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                t3.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new Question();
    }
}
