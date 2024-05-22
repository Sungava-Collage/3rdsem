package Unit11;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout
{
    MyFlowLayout(){
        JFrame f= new JFrame("FlowLayout");
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");
        f.add(b2);
        f.add(b1);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);



    }

    public static void main(String[] args) {
        new MyFlowLayout();
    }
}