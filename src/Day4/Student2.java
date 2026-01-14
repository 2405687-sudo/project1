package Day4;

import java.util.Scanner;

class Student2 {
    int rollNo;
    String name;

    Student2(int r, String n) {
        rollNo = r;
        name = n;
    }

    public boolean equals(Object obj) {
        Student2 s = (Student2) obj;
        return rollNo == s.rollNo && name.equals(s.name);
    }
}

class EqualsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first student
        System.out.print("Enter roll number of student 1: ");
        int r1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name of student 1: ");
        String n1 = sc.nextLine();

        // Input for second student
        System.out.print("Enter roll number of student 2: ");
        int r2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name of student 2: ");
        String n2 = sc.nextLine();

        Student2 s1 = new Student2(r1, n1);
        Student2 s2 = new Student2(r2, n2);

        if (s1.equals(s2)) {
            System.out.println("Both students are equal");
        } else {
            System.out.println("Students are not equal");
        }
    }
}
