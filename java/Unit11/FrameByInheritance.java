package Unit11;

import javax.swing.*;
public class FrameByInheritance extends JFrame {
    FrameByInheritance()
    {
        setTitle("Kashi Don");
        setSize(300, 200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new FrameByInheritance();
    }

    
}