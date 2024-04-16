package Unit10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Student> a1 = new ArrayList<Student>();
        int i, rollno, age, n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("No of students:");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Enter Rollno, Name, and Age:");
            rollno = sc.nextInt();
            name = sc.next();
            age = sc.nextInt();
            a1.add(new Student(rollno, name, age));
        }
        System.out.println("\nSorting by Name:");
        Collections.sort(a1, new NameComparator());
        for (Student st : a1) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("\nSorting By Age:");
        Collections.sort(a1, new AgeComparator());
        for (Student st : a1) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
