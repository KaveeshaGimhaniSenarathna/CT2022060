import java.util.Scanner;
import java.util.Calendar;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = input.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("Lab worksheet 2: Numerical Data");
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

        input.close();
    }
}

