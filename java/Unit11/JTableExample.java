package Unit11;

import javax.swing.*;

public class JTableExample {
    JTableExample()
    {
        JFrame f = new JFrame("Table");
        String[][] data ={
            {"kashi lama", "BCA"},
            { "Anish Sapkota", "BCA"},
            {"Rajesh", "BCA"},

        };
        String[] columnName = { "Name", "Course" };
        JTable table = new JTable(data, columnName);
        table.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(table);

        f.add(sp);
       
        f.setSize(400,500);
       
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new JTableExample();

    }
}
