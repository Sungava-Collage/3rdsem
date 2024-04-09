import java.io.*;

class Student implements Serializable {
    int rollno;
    String name;
}

public class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = null;
        try {
            FileInputStream fin = new FileInputStream("E:\\3rdsem\\student.ser");
            ObjectInputStream in = new ObjectInputStream(fin);
            s = (Student) in.readObject();
            System.out.println("Rollno: " + s.rollno);
            System.out.println("Name: " + s.name);
            in.close();
            fin.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
