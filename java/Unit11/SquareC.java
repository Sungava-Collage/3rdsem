package Unit11;

import javax.swing.*;
import java.awt.event.*;

public class SquareC {
    SquareC() {
        JFrame f = new JFrame("Square Calculator");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 250);
        f.setVisible(true);

        JLabel numberLabel = new JLabel("Enter any number:");
        numberLabel.setBounds(30, 50, 150, 30);
        f.add(numberLabel);

        JTextField txtNumber = new JTextField();
        txtNumber.setBounds(180, 50, 150, 30);
        f.add(txtNumber);

        JButton btn = new JButton("Calculate Square");
        btn.setBounds(100, 100, 200, 30);
        f.add(btn);

        JLabel resultJLabel = new JLabel("Square of Enter number:");
        resultJLabel.setBounds(30, 150, 150, 30);
        f.add(resultJLabel);

        JTextArea resultTextArea = new JTextArea();
        resultTextArea.setBounds(200, 150, 150, 30);
        resultTextArea.setEditable(false); 
        f.add(resultTextArea);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(txtNumber.getText());
                    int square = num * num;
                    resultTextArea.setText(Integer.toString(square));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid number.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SquareC();
            }
        });
    }
}