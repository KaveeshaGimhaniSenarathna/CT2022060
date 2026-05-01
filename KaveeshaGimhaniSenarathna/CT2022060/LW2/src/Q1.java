public class Q1 {
    public static void main(String[] args) {


        double A = 2.0, B = 5.0, C = 3.0;
        double X = 8.0, Y = 2.0;
        double radius = 7.0;

        double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);

        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));

        double resultC = Math.cbrt(X * Y);

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("a. Square root of B^2 + 4AC: " + resultA);
        System.out.println("b. Square root of X + 4Y^3: " + resultB);
        System.out.println("c. Cube root of XY: " + resultC);
        System.out.println("d. Area of the circle: " + area);
    }
}

