package Unit11;
import java.awt.Color;
import javax.swing.*;
public class panelExample {

    panelExample()
    {
        JFrame f= new JFrame("panel example");
        JPanel p = new JPanel();
        JButton b1=new JButton("OK");
        JButton b2=new JButton("Cancel");
        p.add(b1);
        p.add(b2);
        p.setBounds(10,80,300,100);
        p.setBackground(Color.green);
        f.add(p);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new panelExample();
    }
    
    
}
