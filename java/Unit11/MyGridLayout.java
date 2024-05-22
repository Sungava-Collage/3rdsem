package Unit11;
import java.awt.*;
import javax.swing.*;

public class MyGridLayout {
    MyGridLayout(){
        JFrame f = new JFrame("GridLayout Demo");
        JButton b1 = new JButton("Buttion 1");
        JButton b2 = new JButton("Buttion 2");
        JButton b3 = new JButton("Buttion 3");
        JButton b4 = new JButton("Buttion 4");
        JButton b5 = new JButton("Buttion 5");
        JButton b6 = new JButton("Buttion 6");
        JButton b7 = new JButton("Buttion 7");
        JButton b8 = new JButton("Buttion 8");
        JButton b9 = new JButton("Buttion 9");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b9);
        f.add(b8);
        f.add(b7);
        f.add(b6);

        f.setLayout(new GridLayout(4,3));

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new MyGridLayout();
    }
}
