package Q06;

import Q01.Pet;
import Q01.Dog;
import Q01.Cat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Cat> cats = new ArrayList<>();
    static ArrayList<Dog> dogs = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter initial pets. Type STOP to finish.");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Type (c = cat, d = dog): ");
            char type = sc.nextLine().toLowerCase().charAt(0);
            addPet(type, name);
        }

        displayAll();

        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Cat name: ");
                    addPet('c', sc.nextLine());
                    break;
                case 2:
                    System.out.print("Dog name: ");
                    addPet('d', sc.nextLine());
                    break;
                case 3:
                    System.out.print("Cat name to remove: ");
                    removePet(sc.nextLine(), 'c');
                    break;
                case 4:
                    System.out.print("Dog name to remove: ");
                    removePet(sc.nextLine(), 'd');
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (choice != 0) displayAll();

        } while (choice != 0);
    }

    static void addPet(char type, String name) {
        if (type == 'c') {
            Cat cat = new Cat();
            cat.setName(name);
            System.out.print("Coat color: ");
            cat.setCoatColor(sc.nextLine());
            pets.add(cat);
            cats.add(cat);
            System.out.println("Cat '" + name + "' added.");
        } else {
            Dog dog = new Dog();
            dog.setName(name);
            System.out.print("Weight (kg): ");
            dog.setWeight(Double.parseDouble(sc.nextLine()));
            pets.add(dog);
            dogs.add(dog);
            System.out.println("Dog '" + name + "' added.");
        }
    }

    static void removePet(String name, char type) {
        if (type == 'c') {
            Cat found = null;
            for (Cat c : cats) {
                if (c.getName().equalsIgnoreCase(name)) {
                    found = c;
                    break;
                }
            }
            if (found != null) {
                cats.remove(found);
                pets.remove(found);
                System.out.println("Cat '" + name + "' removed.");
            } else {
                System.out.println("Cat '" + name + "' not found.");
            }
        } else {
            Dog found = null;
            for (Dog d : dogs) {
                if (d.getName().equalsIgnoreCase(name)) {
                    found = d;
                    break;
                }
            }
            if (found != null) {
                dogs.remove(found);
                pets.remove(found);
                System.out.println("Dog '" + name + "' removed.");
            } else {
                System.out.println("Dog '" + name + "' not found.");
            }
        }
    }

    static void displayAll() {
        System.out.println("\n--- Current Cats ---");
        if (cats.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (Cat c : cats) {
                System.out.println("  Name: " + c.getName() + " | Coat: " + c.getCoatColor());
            }
        }
        System.out.println("--- Current Dogs ---");
        if (dogs.isEmpty()) {
            System.out.println("  (none)");
        } else {
            for (Dog d : dogs) {
                System.out.println("  Name: " + d.getName() + " | Weight: " + d.getWeight() + " kg");
            }
        }
    }
}
