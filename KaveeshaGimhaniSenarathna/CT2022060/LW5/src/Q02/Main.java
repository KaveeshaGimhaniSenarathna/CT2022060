package Q02;

import Q01.Pet;
import Q01.Dog;
import Q01.Cat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Type (c = cat, d = dog): ");
            char type = sc.nextLine().toLowerCase().charAt(0);

            Pet pet = (type == 'c') ? new Cat() : new Dog();
            pet.setName(name);
            pets.add(pet);
        }

        System.out.println("\n--- Pet List ---");
        for (Pet p : pets) {
            String type = (p instanceof Cat) ? "Cat" : "Dog";
            System.out.println("Name: " + p.getName() + " | Type: " + type);
        }
    }
}