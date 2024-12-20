import java.awt.*;
import javax.swing.*;
public class BorderLayoutExample {
    BorderLayoutExample(){
        JFrame frameobj=new JFrame("BoarderLayout");
        
        JButton b1=new JButton("North");
        JButton b2=new JButton("South");
        JButton b3=new JButton("West");
        JButton b4=new JButton("East");
        JButton b5=new JButton("Center");

        frameobj.setLayout(new BorderLayout());
        frameobj.add(b1,BorderLayout.NORTH);
        frameobj.add(b2,BorderLayout.SOUTH);
        frameobj.add(b3,BorderLayout.WEST);
        frameobj.add(b4,BorderLayout.EAST);
        frameobj.add(b5,BorderLayout.CENTER);
        //frameobj.setSize(150,150);
        frameobj.setSize(200,200);
        frameobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameobj.setVisible(true);


    }
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
