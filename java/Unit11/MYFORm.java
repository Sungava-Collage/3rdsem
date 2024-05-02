package Unit10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MYFORm extends JFrame {
    MYFORm() {
        // Set frame properties
        setTitle("Kashi Don");
        setSize(300, 200);
        setLayout(null); // Use absolute positioning
        
        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30); // Set position and size
       
       
        // Create a submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 100, 100, 30); // Set position and size
        
        // Add an action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action when the button is clicked
                String inputText = textField.getText(); // Get text from the text field
                JOptionPane.showMessageDialog(null, "Submitted: " + inputText); // Display it in a popup
            }
        });
        
        // Add the components to the frame
        add(textField);
        add(submitButton);
        
        // Set frame visibility and default close operation
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        new MYFORm();
    }
}
