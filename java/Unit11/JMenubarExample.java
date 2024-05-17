package Unit11;
import javax.swing.*;

public class JMenubarExample extends JFrame {
    static JMenuBar mb;
    static JMenu file, edit,format,View, help,subMenu;
    static JMenuItem neww,newWindow,open,save,saveas,pageSetUp,print,exit,subMenu1,subMenu2;
    static JFrame f;
    public static void main(String[] args) {
        f=new JFrame("Menu");
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        View = new JMenu("View");
        help = new JMenu("Help");
        subMenu = new JMenu("Sub Menu");


        neww=new  JMenuItem("New");
        newWindow=new JMenuItem("New Window");
        open=new JMenuItem("Open");
        save=new JMenuItem("Save");
        saveas= new JMenuItem("Save as");
        pageSetUp=new JMenuItem("Page Setup");
        print=new JMenuItem("Print");
        exit=new JMenuItem("Exit");
        subMenu1=new JMenuItem("Sub Menu 1");
        subMenu2=new JMenuItem("Sub Menu 2");

        file.add(neww);
        file.add(newWindow);
        file.add( open);
        file.add(save);
        file.add(saveas);
        file.add(pageSetUp);
        file.add(print);
        file.add(exit);

        subMenu.add(subMenu1);
        subMenu.add(subMenu2);
        file.add(subMenu);

        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(format);
        mb.add(help);
        
        f.setJMenuBar(mb);

        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
        
    }


}
