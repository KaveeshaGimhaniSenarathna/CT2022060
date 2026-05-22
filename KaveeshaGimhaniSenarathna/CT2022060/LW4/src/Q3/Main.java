package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = sc.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = sc.nextDouble();

        Circle inner = new Circle(ri);
        Circle outer = new Circle(ro);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area: " + shadedArea);
    }
}