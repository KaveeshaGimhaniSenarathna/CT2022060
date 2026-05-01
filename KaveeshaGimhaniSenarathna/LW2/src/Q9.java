import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount (P): ");
        double P = input.nextDouble();

        System.out.print("Enter annual interest rate (R): ");
        double R = input.nextDouble();

        System.out.print("Enter number of years (N): ");
        int N = input.nextInt();

        double amount = P * Math.pow((1 + (R / 100)), N);

        System.out.println("After " + N + " years, your investment will grow to: " + String.format("%.2f", amount) + " dollars.");

        input.close();
    }
}

