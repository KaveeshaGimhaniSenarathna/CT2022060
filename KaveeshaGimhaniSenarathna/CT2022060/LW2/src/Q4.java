import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double bodyWeight = input.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println("Daily calories needed: " + calories);

        input.close();
    }
}

