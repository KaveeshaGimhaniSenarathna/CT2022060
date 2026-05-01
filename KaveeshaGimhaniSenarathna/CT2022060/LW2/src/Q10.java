import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MONTHS_IN_YEAR = 12;

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 7.5): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan period (number of years): ");
        int loanPeriod = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: " + String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: " + String.format("%.2f", totalPayment));

        input.close();
    }
}

