package Q05;

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

        // Dog-only array
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet p : pets) {
            if (p instanceof Dog) {
                dogs.add((Dog) p);
            }
        }

        if (dogs.isEmpty()) {
            System.out.println("\nNo dogs entered.");
            return;
        }

        double total = 0;
        double min = dogs.get(0).getWeight();
        double max = dogs.get(0).getWeight();

        for (Dog d : dogs) {
            double w = d.getWeight();
            total += w;
            if (w < min) min = w;
            if (w > max) max = w;
        }

        System.out.println("\n--- Dog Weight Stats ---");
        System.out.printf("Average : %.2f kg%n", total / dogs.size());
        System.out.printf("Minimum : %.2f kg%n", min);
        System.out.printf("Maximum : %.2f kg%n", max);
    }
}
