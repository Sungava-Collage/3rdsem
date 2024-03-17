public class staticvariable {
    int rollno;
    String name;
    static String subject="OOP in JAVA";
    staticvariable(int r,String n )
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println("\n Rollno : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Subject : "+ subject);
    }
    public static void main(String args[])
    {
        staticvariable obj1=new staticvariable(1,"Monika");
        staticvariable obj2=new staticvariable(2,"Subina");
        obj1.display();
        obj2.display();
    }
}
