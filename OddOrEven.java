import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO IDENTIFY IF ITS ODD OR EVEN, AND NEGATIVE OR POSITIVE :");
        number = scan.nextInt();

        if(number<0) {
            System.out.println("Your number is negative");
        } else {
                System.out.println("Your number is positive"+number);
            }
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
