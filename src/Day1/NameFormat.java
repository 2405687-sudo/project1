
import java.util.Scanner;

public class NameFormat {
    String firstName;
    String lastName;

    NameFormat(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayName() {
        System.out.println(lastName + " " + firstName);
    }
}

class NameFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        NameFormat nf = new NameFormat(firstName, lastName);
        nf.displayName();
    }
}
