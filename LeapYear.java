package Day5;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else {
                    leapYear = false;
                }
            }
            else {
                leapYear = true;
            }
        }
        else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}