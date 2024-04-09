import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student implements java.io.Serializable {
    int rollno;
    String name;
}

public class serializationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollno = 5;
        s.name = "Kashi";
        try {
            FileOutputStream fout = new FileOutputStream("E:\\3rdsem\\student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s); // Serialize the student object
            out.close();
            fout.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
