package Day3;
import java.util.Scanner;
public class Plastic2D {
    int length, width;
    Plastic2D(int l, int w) {
        length = l;
        width = w;
    }
    void cost() {
        int area = length * width;
        int cost = area * 40;
        System.out.println("Cost of 2D sheet = Rs. " + cost);
    }
}
class Plastic3D extends Plastic2D {
    int height;

    Plastic3D(int l, int w, int h) {
        super(l, w);
        height = h;
    }

    void cost() {
        int volume = length * width * height;
        int cost = volume * 60;
        System.out.println("Cost of 3D box = Rs. " + cost);
    }
}

class PlasticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        Plastic3D p = new Plastic3D(l, w, h);
        p.cost();
    }
}