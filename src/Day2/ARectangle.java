package Day2;

import java.util.Scanner;

class ARectangle {
    int length, breadth;


    ARectangle() {
        length = 0;
        breadth = 0;
    }

    ARectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class ARectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        ARectangle r = new ARectangle(l, b);
        r.area();
    }
}
