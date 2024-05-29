package Unit11;

import javax.swing.*;
import java.awt.event.*;

/**
 * InternalFrameExample
 */
public class InternalFrameExample {
    public static void main(String[] args) {
        JFrame parentFrame = new JFrame("Parent Frame");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600, 400);
        // Create Internal Frames
        JInternalFrame internalFrame1 = new JInternalFrame("Internal Frame 1",true,true,true,true);
        internalFrame1.setBounds(50, 50, 200, 150);
        internalFrame1.setVisible(true);
        JInternalFrame internalFrame2 = new JInternalFrame("Internal Frame 2",true,true,true,true);
        internalFrame2.setBounds(250,100, 200, 150);
        internalFrame2.setVisible(true);
        // Add internal frames to desktop pane
        JDesktopPane desktopPane = new JDesktopPane();
        parentFrame.add(internalFrame1);
        parentFrame.add(internalFrame2);

        parentFrame.add(desktopPane);
        parentFrame.setVisible(true);
    }
    
}