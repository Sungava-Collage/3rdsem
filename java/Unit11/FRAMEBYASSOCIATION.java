package Unit11;
import javax.swing.*;

/**
 * Created by htc on 20-Mar-17.
 */

public class FRAMEBYASSOCIATION {
    FRAMEBYASSOCIATION()
    {
        JFrame f = new JFrame("K don");
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new FRAMEBYASSOCIATION();
    }
}
