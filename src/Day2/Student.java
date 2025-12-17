package Day2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    Student(int r, String n, float c) {
        roll = r;
        name = n;
        cgpa = c;
    }

    void display() {
        System.out.println(roll + "  " + name + "  " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter CGPA: ");
            float c = sc.nextFloat();

            s[i] = new Student(r, name, c);

            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);
    }
}

