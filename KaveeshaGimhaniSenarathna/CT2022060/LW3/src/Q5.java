import java.util.Scanner;

public class Q5 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Entree");
            System.out.println("1. Tofu Burger - $3.49");
            System.out.println("2. Cajun Chicken - $4.59");
            System.out.println("3. Buffalo Wings - $3.99");
            System.out.println("4. Rainbow Fillet - $2.99");

            System.out.print("Select entree: ");
            int entree = input.nextInt();

            System.out.println("\nSide Dish");
            System.out.println("1. Rice Cracker - $0.79");
            System.out.println("2. No-Salt Fries - $0.69");
            System.out.println("3. Zucchini - $1.09");
            System.out.println("4. Brown Rice - $0.59");

            System.out.print("Select side dish: ");
            int side = input.nextInt();

            System.out.println("\nDrink");
            System.out.println("1. Cafe Mocha - $1.99");
            System.out.println("2. Cafe Latte - $1.90");
            System.out.println("3. Espresso - $2.49");
            System.out.println("4. Oolong Tea - $0.99");

            System.out.print("Select drink: ");
            int drink = input.nextInt();

            System.out.println("Order completed!");
        }
    }

