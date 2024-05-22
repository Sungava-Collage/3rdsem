package Unit11;

import java.awt.*;
import java.awt.event.*;;

public class KeyListenerExample extends Frame implements KeyListener {
    Label l;
    TextArea area;
    public KeyListenerExample() {
        l=new Label ();
        l.setBounds(20, 50, 100, 20);
        area = new TextArea();
        area.setBounds(20, 80, 200, 200);
        area.addKeyListener(this);
        add(l);
        add(area);
        setTitle("Enter Event");
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Typed");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Pressed");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Relesed");
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
