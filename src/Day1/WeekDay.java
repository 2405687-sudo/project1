import java.util.Scanner;

public class WeekDay {
    int dayNo;
    String weekDay;

    WeekDay(int dayNo) {
        this.dayNo = dayNo;

        switch (dayNo) {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break;
            default:
                weekDay = "Invalid Day Number";
        }
    }

    void displayWeekDay() {
        System.out.println("Week Day: " + weekDay);
    }
}

class WeekDayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Day Number (1 to 7):");
        int dayNo = sc.nextInt();

        WeekDay wd = new WeekDay(dayNo);
        wd.displayWeekDay();
    }
}
