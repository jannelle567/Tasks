import java.util.Scanner;
import java.io.*;

public class largestNumber {
    public static void main(String[] args) {
        int uno = 0, dos = 0, tres = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 3 random number: ");
    uno = scan.nextInt();
    dos = scan.nextInt();
    tres = scan.nextInt();
    
     if (uno == dos && uno == tres) {
            System.out.println("All numbers are equal");
}
int largest;
    if (uno >= dos && uno >= tres) {
                largest = uno;
            } else if (dos >= uno && dos >= tres) {
                largest = dos;
            } else {
                largest = tres;
            }
            System.out.println("The largest number is " + largest);
        }
}
