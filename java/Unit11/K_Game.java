package Unit11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class K_Game extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    double rotation = 0; // Initial rotation angle
    int imageWidth = 154;
    int imageHeight = 154;

    K_Game() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(new Color(0, 255, 0));

        // Load the image
        icon = new ImageIcon(getClass().getResource("i.jpg"));

        label = new JLabel(icon) {
            // Override paintComponent to rotate the image
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                AffineTransform at = AffineTransform.getTranslateInstance(getWidth() / 2, getHeight() / 2);
                at.rotate(Math.toRadians(rotation), imageWidth / 2, imageHeight / 2);
                g2d.drawImage(icon.getImage(), at, this);
                g2d.dispose();
            }
        };
        label.setBounds(0, 0, imageWidth, imageHeight);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);
    }

    public void keyTyped(KeyEvent e) {
        // This method is called when a key is typed
    }

    public void keyPressed(KeyEvent e) {
        // This method is called when a key is pressed
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                label.setLocation(label.getX() - 10, label.getY());
                rotation = 270; // Set rotation angle to 270 degrees (left)
                break;
            case KeyEvent.VK_RIGHT:
                label.setLocation(label.getX() + 10, label.getY());
                rotation = 90; // Set rotation angle to 90 degrees (right)
                break;
            case KeyEvent.VK_UP:
                label.setLocation(label.getX(), label.getY() - 10);
                rotation = 0; // Set rotation angle to 0 degrees (up)
                break;
            case KeyEvent.VK_DOWN:
                label.setLocation(label.getX(), label.getY() + 10);
                rotation = 180; // Set rotation angle to 180 degrees (down)
                break;
        }
        label.repaint(); // Repaint the label to reflect the rotation
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
