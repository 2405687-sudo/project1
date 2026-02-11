package Day6;

class Bank {
    double balance = 5000;   // non-static member

    static class InterestCalculator {
        static double calculateSI(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void show() {
            // Cannot access non-static member directly
            // System.out.println(balance); ❌ ERROR
        }
    }

    public static void main(String[] args) {
        double si = Bank.InterestCalculator.calculateSI(1000, 5, 2);
        System.out.println("Simple Interest = " + si);
    }
}
