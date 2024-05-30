package Unit11;


import java.awt.event.*;
import javax.swing.*;

public class sum {

    sum() {
        JFrame f = new JFrame("Sum of Two Numbers");
        f.setLayout(null);
        f.setSize(400, 200);
        f.setVisible(true);

        JLabel lblFirstNumber = new JLabel("First Number : ");
        lblFirstNumber.setBounds(20, 30, 150, 20);
        f.add(lblFirstNumber);

        JTextField txtFirstNumber = new JTextField();
        txtFirstNumber.setBounds(150, 30, 150, 20);
        f.add(txtFirstNumber);

        JLabel lblSecondNumber = new JLabel("Second Number : ");
        lblSecondNumber.setBounds(20, 55, 150, 20);
        f.add(lblSecondNumber);

        JTextField txtSecondNumber = new JTextField();
        txtSecondNumber.setBounds(150, 55, 150, 20);
        f.add(txtSecondNumber);

        JLabel sumLabel = new JLabel("Sum");
        sumLabel.setBounds(20, 80, 150, 20);
        f.add(sumLabel);

        JTextField txtSum = new JTextField();
        txtSum.setBounds(150, 80, 150, 20);
        f.add(txtSum);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 110, 80, 20);
        f.add(btnAdd);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(170, 110, 80, 20);
        f.add(btnCancel);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtFirstNumber.getText());
                    int num2 = Integer.parseInt(txtSecondNumber.getText());
                    int sum = num1 + num2;
                    txtSum.setText(Integer.toString(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers");
                }
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtFirstNumber.setText("");
                txtSecondNumber.setText("");
                txtSum.setText("");
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new sum();
    }
}