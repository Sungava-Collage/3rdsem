package Unit3;

import java.util.Scanner;

public class MethodOverloading {
    void area(int r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle: " + (l * b));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MethodOverloading obj = new MethodOverloading();
        int radius, length, breadth;
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextInt();
        obj.area(radius);
        System.out.println("Enter length and breadth of rectangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        obj.area(length, breadth);
    }
}
