package Unit11;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListExample {
    JListExample(){
        JFrame f = new JFrame("List");
        DefaultListModel<String> ll= new DefaultListModel<>() ;
        ll.addElement("Cricket");
        ll.addElement("Football");
        ll.addElement("Volleyball");
        ll.addElement("TableTenis");
        JList<String> list= new JList<>(ll);

        list.setBounds(100,100,75,75);

        f.add(list);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JListExample();
    }
    
}
