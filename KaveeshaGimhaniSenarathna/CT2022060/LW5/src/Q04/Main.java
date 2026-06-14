package Q04;

import Q01.Pet;
import Q01.Dog;
import Q01.Cat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet info. Type STOP to finish.");

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Type (c = cat, d = dog): ");
            char type = sc.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Coat color: ");
                cat.setCoatColor(sc.nextLine());
                pets.add(cat);
            } else {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Weight (kg): ");
                dog.setWeight(Double.parseDouble(sc.nextLine()));
                pets.add(dog);
            }
        }

        System.out.println("\n--- Cats ---");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                Cat c = (Cat) p;
                System.out.println("Name: " + c.getName() + " | Type: Cat | Coat: " + c.getCoatColor());
            }
        }

        System.out.println("\n--- Dogs ---");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                Dog d = (Dog) p;
                System.out.println("Name: " + d.getName() + " | Type: Dog | Weight: " + d.getWeight() + " kg");
            }
        }
    }
}
