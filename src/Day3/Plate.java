package Day3;
import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);
        height = h;
        System.out.println("Box Height: " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox Thickness: " + thick);
    }
}
class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter thickness: ");
        int t = sc.nextInt();

        new WoodBox(l, w, h, t);
    }
}
