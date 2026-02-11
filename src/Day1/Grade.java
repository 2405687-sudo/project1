package Day1;
import java.util.Scanner;

public class Grade {
    int marks;
    String grade;

    Grade(int marks) {
        this.marks = marks;

        if (marks >= 90) {
            grade = "O";
        } else if (marks >= 80) {
            grade = "E";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }
    }

    void displayGrade() {
        System.out.println("Grade: " + grade);
    }
}

class GradeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        Grade g = new Grade(marks);

        g.displayGrade();
    }
}
