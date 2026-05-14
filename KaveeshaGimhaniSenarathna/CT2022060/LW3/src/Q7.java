import java.util.Scanner;

public class Q7 {

        public static int countDigits(int number) {

            number = Math.abs(number);

            if (number == 0) {
                return 1;
            }

            int count = 0;

            while (number > 0) {
                number /= 10;
                count++;
            }

            return count;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            while (true) {

                System.out.print("Enter an integer: ");
                int num = input.nextInt();

                if (num < 0) {
                    break;
                }

                System.out.println("Digits: " + countDigits(num));
            }
        }
    }
