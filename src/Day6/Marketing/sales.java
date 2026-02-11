package Day6.Marketing;

import Day6.General.employee;
import java.util.Scanner;

public class sales extends employee {

    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        sales s = new sales(id, name, basic);
        double totalEarning = s.earnings() + s.tallowance();

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + totalEarning);
    }
}