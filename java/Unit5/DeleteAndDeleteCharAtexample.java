public class DeleteAndDeleteCharAtexample {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("OOP in Java");
        System.out.println(s);
        s.delete(2, 7);
        System.out.println(s);
        StringBuffer str= new StringBuffer("BCA 3rd Semester");
        str.deleteCharAt(2);
        System.out.println(str);

    }
}
