package Day2;
import java.util.Scanner;

class EvenOddCount {
    int[] nums = new int[10];
    int evenCount = 0;
    int oddCount = 0;

    // Constructor to accept numbers
    EvenOddCount(int[] nums) {
        this.nums = nums;
    }

    // Method to check even and odd
    void checkEvenOdd() {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers = " + evenCount);
        System.out.println("Number of odd numbers = " + oddCount);
    }
}

class EvenOddCountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        EvenOddCount nc = new EvenOddCount(numbers);
        nc.checkEvenOdd();
    }
}

