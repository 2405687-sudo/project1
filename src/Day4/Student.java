package Day4;

import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rollno: ");
        int roll = sc.nextInt();

        System.out.print("Enter Registration no: ");
        long reg = sc.nextLong();

        Kiitian k = new Kiitian();
        k.getInput(roll, reg);
        k.display();
    }
}
