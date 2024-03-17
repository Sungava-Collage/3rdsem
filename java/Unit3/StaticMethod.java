public class StaticMethod {

    static int rollno;
    static String name;
    static String  subject;
    StaticMethod(int r, String n,String s){
        rollno=r;
        name=n;
        subject=s;
    }
    static void display(){
        System.out.println("\n Roll No : "+ rollno);
        System.out.println("\n Name : "+ name);
        System.out.println("\n Subject : " + subject);
    }
    public static void main(String[] args) {
        StaticMethod obj=new StaticMethod(1, "Nabina","DSA");
        display();
    }
}