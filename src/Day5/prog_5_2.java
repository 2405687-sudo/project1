package Day5;

import java.util.Scanner;
interface salary{
    void earning();
    void deductions();
    void bonus();
}
abstract class Manager implements salary{
    double basic;
    Manager(double basic){
        this.basic = basic;
    }
    public void earning(){
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double earnings = da + hra + basic;
        System.out.println("Total earnings- " + earnings);
    }
    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + pf);
    }
}
class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }
    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + bonus);
    }
}
public class prog_5_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        Substaff s = new Substaff(basicSalary);
        s.earning();
        s.deductions();
        s.bonus();
    }
}
