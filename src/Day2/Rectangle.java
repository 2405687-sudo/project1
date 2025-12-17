package Day2;

import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + 2 * (length + breadth));
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.area();
        r.perimeter();
    }
}
