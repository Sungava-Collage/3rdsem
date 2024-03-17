public class staticBlock {
    static int rollno;
    static String name;
    static String subject;
    static
    {
        rollno=1;
        name="MR K";
        subject="OOP on java";
    }
    void display()
    {
        System.out.println("\n Rollno : " + rollno);
        System.out.println("Name : " + name);
        System.out.println("Subject : "+ subject);
    }
    public static void main(String[] args) {
        staticBlock obj=new staticBlock();
        obj.display();
    }
}
