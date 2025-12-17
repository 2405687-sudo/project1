import java.util.Scanner;

public class StudentDetails {
    String name;
    int rollNumber;
    int section;
    String branch;

    StudentDetails(int rollNumber, String name, int section, String branch) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.section = section;
        this.branch = branch;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}

class StudentDetailsDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the roll number:");
        int rollNumber = sc.nextInt();

        System.out.println("Enter the section:");
        int section = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the branch:");
        String branch = sc.nextLine();

        StudentDetails sd = new StudentDetails(rollNumber, name, section, branch);
        sd.displayDetails();
    }
}
