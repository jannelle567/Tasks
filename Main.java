import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.printf("\nDays in Months:\n 1, January\n 2. February\n 3, March\n 4, April\n 5, May\n 6, June\n 7, July\n 8, August\n 9, September\n 10, October\n 11, November\n 12, December\n Enter a number: ");
        month = scan.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("this month has 31 days");
            case 4, 6, 9 -> System.out.println("this month has 30 days");
            case 2 -> System.out.println("February can have 28 or 29 days");
            default -> System.out.println("invalid month");
        }
    }
}