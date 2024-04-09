import java.io.*;
import java.util.Scanner;

public class WritetoReadFromFile {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("E:\\3rdsem\\Student.txt");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            int i, n, rollno;
            String name, address, cname;
            Scanner sc = new Scanner(System.in);
            System.out.println("No of students: ");
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                System.out.println("\nRollno: ");
                rollno = sc.nextInt();
                System.out.println("Name: ");
                name = sc.next();
                System.out.println("Address:");
                address = sc.next();
                System.out.println("College Name: ");
                cname = sc.next();
                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }
            System.out.println("\nRollno\tName\tAddress\tCollage Name");
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            for (i = 0; i < n; i++) {
                rollno = dis.readInt();
                name = dis.readUTF();
                address = dis.readUTF();
                cname = dis.readUTF();
                if (address.compareToIgnoreCase("JHAPA") == 0)
                    System.out.println(rollno + "\t" + name + "\t" + address + "\t" + cname);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
