package Unit11;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    LoginForm()
    {

        // Frame
        JFrame f = new JFrame("Login Form");
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Lable
    JLabel l1 = new JLabel("Username");
    l1.setBounds(20,20,100,20);
    // add lable in the frame
    f.add(l1);

    
    JTextField t1 = new JTextField();
    t1.setBounds(120,20,100,20);
    f.add(t1);
        // Lable
    JLabel l2 = new JLabel("Password");
    l2.setBounds(20,50,100,20);
    // add lable in the frame
    f.add(l2);
       
    JPasswordField p1 = new JPasswordField();
        p1.setBounds(120,50,100,20);
        f.add(p1);

        JButton b1 = new JButton("Login");
        b1.setBounds(80,80,100,20);
        f.add(b1);
        JButton b2 = new JButton("Cancle");
        b2.setBounds(200,80,100,20);
        f.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action when the button is clicked
                String inputText = t1.getText(); // Get text from the text field
                
                JOptionPane.showMessageDialog(null, " Welcome " + inputText); // Display it in a popup
            }
        });

    
    
   
        
    }
    public static void main(String[] args) {
        new LoginForm();
    }
}
