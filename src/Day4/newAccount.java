package Day4;
import java.util.Scanner;

class Account {
    static int accCounter = 1000;
    int accNo;
    String name, accType;
    double balance;

    Account(String name, String accType, double balance) {
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        accNo = ++accCounter;
    }

    void checkBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance = Rs. " + balance);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs. " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdrawal defined in subclass");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance) {
        super(name, "Standard", balance);
    }

    void withdraw(double amt) {
        if (amt <= 100000 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn Rs. " + amt);
        }
        else if (amt <= 500000 && amt <= balance) {
            double penalty = amt * 0.0005;
            balance -= (amt + penalty);
            System.out.println("Withdrawn Rs. " + amt +
                    " with penalty Rs. " + penalty);
        }
        else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double balance) {
        super(name, "Premium", balance);
    }

    void withdraw(double amt) {
        if (amt <= 1000000 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn Rs. " + amt);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Standard Account Input
        System.out.println("Enter Standard Account Holder Name:");
        String name1 = sc.nextLine();
        System.out.println("Enter Initial Balance:");
        double bal1 = sc.nextDouble();

        Account a1 = new StandardAccount(name1, bal1);

        System.out.println("Enter withdrawal amount:");
        double w1 = sc.nextDouble();
        a1.withdraw(w1);
        a1.checkBalance();

        sc.nextLine(); // clear buffer

        // Premium Account Input
        System.out.println("\nEnter Premium Account Holder Name:");
        String name2 = sc.nextLine();
        System.out.println("Enter Initial Balance:");
        double bal2 = sc.nextDouble();

        Account a2 = new PremiumAccount(name2, bal2);

        System.out.println("Enter withdrawal amount:");
        double w2 = sc.nextDouble();
        a2.withdraw(w2);
        a2.checkBalance();
    }
}
