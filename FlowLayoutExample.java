import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample {
        //JFrame frameObj;
    FlowLayoutExample(){
        JFrame frameObj=new JFrame();
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        frameObj.add(b1);
        frameObj.add(b2);
        frameObj.setLayout(new FlowLayout());
        frameObj.setSize(300,300);
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObj.setVisible(true);

    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
    
}
