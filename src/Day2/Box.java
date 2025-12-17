package Day2;

import java.util.Scanner;

class Box {
    int length, width, height;

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    void volume() {
        int vol = length * width * height;
        System.out.println("Volume = " + vol);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter width: ");
        int w = sc.nextInt();
        System.out.println("Enter height: ");
        int h = sc.nextInt();

        Box b = new Box(l, w, h);
        b.volume();
    }
}

