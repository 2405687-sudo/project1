package Day8;
import java.util.Scanner;
class StringOperations{
    String str;

    StringOperations(String str){
        this.str=str;
    }
    void changeCase() {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }
        System.out.println("The string after changing the case is " + result);
    }
    void reverseString() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("The string after reversing is " + rev);
    }

    void compareString(String str2) {
        int diff = str.compareTo(str2);
        System.out.println("The difference between ASCII value is " + diff);
    }

    void insertString(String str2) {
        String result = str + " " + str2;
        System.out.println("The string after insertion is : " + result);
    }

    void convertCase() {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    void checkCharacter(char ch) {
        int pos = str.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + (pos + 1));
        else
            System.out.println("Entered character is not present");
    }

    void checkPalindrome() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }

    void countDetails() {
        int vowels = 0, consonants = 0, words;

        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
        }

        String[] wordArray = str.trim().split("\\s+");
        words = wordArray.length;

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
public class StringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        StringOperations obj = new StringOperations(str);

        System.out.println("\n----- MENU -----");
        System.out.println("1. Change Case");
        System.out.println("2. Reverse String");
        System.out.println("3. Compare Two Strings");
        System.out.println("4. Insert One String into Another");
        System.out.println("5. Convert to Uppercase & Lowercase");
        System.out.println("6. Check Character Position");
        System.out.println("7. Check Palindrome");
        System.out.println("8. Count Words, Vowels & Consonants");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        switch (choice) {

            case 1:
                obj.changeCase();
                break;

            case 2:
                obj.reverseString();
                break;

            case 3:
                System.out.println("Enter second string:");
                String str2 = sc.nextLine();
                obj.compareString(str2);
                break;

            case 4:
                System.out.println("Enter string to insert:");
                String str3 = sc.nextLine();
                obj.insertString(str3);
                break;

            case 5:
                obj.convertCase();
                break;

            case 6:
                System.out.println("Enter a character:");
                char ch = sc.next().charAt(0);
                obj.checkCharacter(ch);
                break;

            case 7:
                obj.checkPalindrome();
                break;

            case 8:
                obj.countDetails();
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
