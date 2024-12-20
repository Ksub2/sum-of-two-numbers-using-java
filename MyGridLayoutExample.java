import java.awt.*;
import javax.swing.*;
public class MyGridLayoutExample {
    MyGridLayoutExample(){
        JFrame f=new JFrame();
        JTextField textField=new JTextField(20);
        JTextArea textarea=new JTextArea(5,20);
        JScrollPane scrollPane=new JScrollPane(textarea);
        textarea.setEditable(true);
        f.add(textField);
    
        JButton b1=new JButton("1");
        b1.setSize(10,10);
        f.add(b1);
        f.setLayout(new GridLayout(2,2));

        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new MyGridLayoutExample();
    }
}
