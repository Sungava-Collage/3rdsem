package Unit11;

import java.awt.*; 
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseAdapterExample extends MouseAdapter {

    Frame f;
    
    MouseAdapterExample(){
        f = new JFrame("Mouse Adapter");
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.CYAN);
        g.fillOval(e.getX(), e.getY(), 30, 30);
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
    
}
