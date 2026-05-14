import java.util.Scanner;

public class Q1 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = input.nextInt();

            System.out.print("Enter second number: ");
            int b = input.nextInt();

            System.out.print("Enter third number: ");
            int c = input.nextInt();

            int smallest = a;

            if (b < smallest) {
                smallest = b;
            }

            if (c < smallest) {
                smallest = c;
            }

            System.out.println("Smallest number is: " + smallest);
        }
    }

