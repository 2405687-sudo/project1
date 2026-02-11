package Day7;
import java.util.Scanner;

class InvalidHourException extends Exception {
    public InvalidHourException(String msg) {
        super(msg);
    }
}

class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String msg) {
        super(msg);
    }
}

class InvalidSecondException extends Exception {
    public InvalidSecondException(String msg) {
        super(msg);
    }
}

class Time {

    int hours, minutes, seconds;

    void setTime(int h, int m, int s)
            throws InvalidHourException, InvalidMinuteException, InvalidSecondException {

        if (h < 0 || h > 24)
            throw new InvalidHourException("hour is not greater than 24");

        if (m < 0 || m > 60)
            throw new InvalidMinuteException("minute is not greater than 60");

        if (s < 0 || s > 60)
            throw new InvalidSecondException("second is not greater than 60");

        hours = h;
        minutes = m;
        seconds = s;

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }
}

class TimeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours:");
        int h = sc.nextInt();

        System.out.println("Enter minutes:");
        int m = sc.nextInt();

        System.out.println("Enter seconds:");
        int s = sc.nextInt();

        Time t = new Time();

        try {
            t.setTime(h, m, s);
        }
        catch (Exception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }

        sc.close();
    }
}
