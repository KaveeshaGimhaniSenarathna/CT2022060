import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length in centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm / 2.54;

        int feet = (int) (totalInches / 12);

        double inches = totalInches % 12;

        System.out.println(cm + " cm is equivalent to:");
        System.out.println(feet + " feet and " + String.format("%.2f", inches) + " inches.");

        input.close();
    }
}

