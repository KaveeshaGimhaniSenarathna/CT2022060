

import java.util.Random;
import java.util.Scanner;

    public class Q11 {
        public static void main(String[] args) {

            Random random = new Random();
            Scanner input = new Scanner(System.in);

            int number = random.nextInt(100) + 1;
            int guess;

            do {

                System.out.print("Guess the number: ");
                guess = input.nextInt();

                if (guess > number) {
                    System.out.println("Lower!");
                } else if (guess < number) {
                    System.out.println("Higher!");
                } else {
                    System.out.println("Correct!");
                }

            } while (guess != number);
        }
    }

