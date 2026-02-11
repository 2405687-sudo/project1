package Day7;
import java.util.Scanner;
public class ArrayExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];   // Array size is 4

        try {
            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < 5; i++) {   // Intentionally exceeding size
                arr[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        sc.close();
    }
}
