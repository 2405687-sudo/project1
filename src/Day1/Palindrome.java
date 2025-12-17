import java.util.Scanner;

public class Palindrome {
    int number;

    Palindrome(int number) {
        this.number = number;
    }

    void checkPalindrome() {
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (reverse == number) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
}

class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        Palindrome p = new Palindrome(number);
        p.checkPalindrome();
    }
}
