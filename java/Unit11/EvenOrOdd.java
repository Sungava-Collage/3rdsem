package Unit11;

import java.awt.event.*;
import javax.swing.*;

public class EvenOrOdd {
    EvenOrOdd() {
        JFrame jframe = new JFrame("Even or Odd");
        jframe.setLayout(null);
        jframe.setSize(400, 200);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        JLabel lblNumber = new JLabel("Enter Number");
        lblNumber.setBounds(20, 30, 150, 20);
        jframe.add(lblNumber);

        JTextField txtNumber = new JTextField();
        txtNumber.setBounds(150, 30, 150, 20);
        jframe.add(txtNumber);

        JButton btnCheck = new JButton("Check");
        btnCheck.setBounds(100, 60, 80, 20);
        jframe.add(btnCheck);

        JLabel lblResult = new JLabel("");
        lblResult.setBounds(100, 85, 150, 20);
        jframe.add(lblResult);

        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(txtNumber.getText());
                if(a%2==0){
                    lblResult.setText("Even");
                }
                else{
                    lblResult.setText("Odd");
                }
            }
        });

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EvenOrOdd();
            }
        });
    
    }
}