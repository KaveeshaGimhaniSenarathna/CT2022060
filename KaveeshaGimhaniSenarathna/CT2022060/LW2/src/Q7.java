import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        int weight = input.nextInt();

        System.out.print("Enter height in centimeters: ");
        int height = input.nextInt();

        double bmi = weight / Math.pow((height / 100.0), 2);

        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));

        input.close();
    }
}

