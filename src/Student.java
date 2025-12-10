import java.util.Scanner;

public class Student {
    int rollNumber;
    String name;

    // Constructor
    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Method to print details
    void getStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}

class StudentDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll number:");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        Student st = new Student(rollNumber, name);
        st.getStudentDetails();
    }
}
