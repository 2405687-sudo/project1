package Day3;
import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.nextLong();
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        super.disp();
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            System.out.println("\nEnter details of person " + (i + 1));
            p[i].input(sc);
        }

        System.out.println("\nPerson Details:");
        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}
