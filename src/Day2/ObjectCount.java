package Day2;
import java.util.Scanner;

class ObjectCount {
    static int count = 0;

    // Constructor
    ObjectCount() {
        count++;
    }

    // Method to display object count
    static void displayCount() {
        System.out.println("Number of objects = " + count);
    }
}

class ObjectCountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to be created: ");
        int n = sc.nextInt();

        // Creating objects
        for (int i = 0; i < n; i++) {
            new ObjectCount();
        }

        ObjectCount.displayCount();
    }
}
