package Unit11;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class K_Game extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    K_Game() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(new Color(0, 255, 0));

        // Load the image
        icon = new ImageIcon(getClass().getResource("i.jpg"));

        label = new JLabel(icon);
        label.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);
    }

    public void keyTyped(KeyEvent e) {
        // This method is called when a key is typed
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        // This method is called when a key is pressed
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case KeyEvent.VK_RIGHT:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            case KeyEvent.VK_UP:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case KeyEvent.VK_DOWN:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        // This method is called when a key is released
        System.out.println("You released Key " + e.getKeyChar());
        System.out.println("You released Key code  " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new K_Game();
    }
}
