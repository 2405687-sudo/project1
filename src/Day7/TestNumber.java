package Day7;
import java.util.Scanner;

// User Defined Exception
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class NumberCheck {

    void processInput(int num) throws NegativeNumberException {

        if (num < 0) {
            throw new NegativeNumberException("number should be positive");
        }
        else {
            System.out.println("Double value: " + (num * 2));
        }
    }
}
public class TestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck();

        try {
            obj.processInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
