package Task121;
import Task121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1978, 1, 1);
        DateTask date2 = new DateTask(1984, 9, 21);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        // Display leap years
        System.out.println("\nLeap years between 1978 and 1984:");
        for (int year = 1978; year <= 1984; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}