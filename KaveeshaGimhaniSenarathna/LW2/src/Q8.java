import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double r = input.nextDouble();

        double PI = 3.14;

        double volume = (4.0 / 3.0) * (PI * Math.pow(r, 3));

        System.out.println("The volume of the sphere with radius " + r + " is: " + volume);

        input.close();
    }
}

