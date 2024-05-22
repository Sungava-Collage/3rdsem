package Unit11;

import java.awt.Label;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

public class MouseListtenerExample extends Frame implements MouseListener {

    Label l;
MouseListtenerExample()
{   
    addMouseListener(this);
    l  = new Label();
    l.setBounds(20,50,100,20);
    add(l);
    setTitle("Mouse Event");
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    

}



@Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("Mouse is Clicked");
}
@Override
public void mousePressed(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("Mouse is pressed");
}
@Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("Mouse is Released");
}
@Override
public void mouseEntered(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("Mouse is Entered");
}
@Override
public void mouseExited(java.awt.event.MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("Mouse is Exited");
}
    public static void main(String[] args) {
        new MouseListtenerExample();

    }
}
