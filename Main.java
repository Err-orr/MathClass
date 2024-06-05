import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Allows user input for the quadratic equation
        Scanner scan = new Scanner(System.in);
        // Highest number for random number generation in randomInt
        int max = 21;
        // Lowest number for random number generation in randomInt
        int min = -20;
        int randomInt = (int) (Math.random() * (max - min) + min);
        // Highest number is 91 for randomAngle, it's 91 because the highest number is exclusive so in reality it's 0-90
        int randomAngle = (int) (Math.random() * 91);
        // User inputs a number in these variables.
        int a;
        int b;
        int c;
        // The first solution for the quadratic equation
        double x;
        // The second solution for the quadratic equation
        double y;
        // User input for a radius of a circle
        double radius;
        // Variable to round a decimal
        double decimal = Math.random() * 11;

        System.out.println(randomInt);
        // Absolute value happens if a number is negative
        System.out.println(Math.abs(randomInt) + "\n");
        System.out.println("The random angle is: " + randomAngle);
        // Sine equation for randomAngle
        System.out.println("Sine: " + Math.sin(randomAngle));
        // Cosine equation for randomAngle
        System.out.println("Cosine: " + Math.cos(randomAngle));
        // Tangent equation for randomAngle
        System.out.println("Tangent: " + Math.tan(randomAngle) + "\n");
        // User inputs
        System.out.print("Enter in a: ");
        a = scan.nextInt();
        System.out.print("Enter in b: ");
        b = scan.nextInt();
        System.out.print("Enter in c: ");
        c = scan.nextInt();
        // The formula for the quadratic equation (getting a not a number result)
        x = -1 * b + Math.sqrt(Math.pow(b, 2.0) - 4 * a * c) / 2 * a;
        y = -1 * b - Math.sqrt(Math.pow(b, 2.0) - 4 * a * c) / 2 * a;
        System.out.println("The first solution is: " + a * Math.pow(x, 2.0) + b * x + c);
        System.out.println("The second solution is: " + a * Math.pow(y, 2.0) + b * y + c + "\n");
        System.out.print("Enter in the radius of your circle: ");
        radius = scan.nextDouble();
        System.out.println("Circumference of circle: " + 2 * Math.PI * radius);
        System.out.println("Area of circle: " + Math.PI * Math.pow(radius, 2.0) + "\n");
        // This is giving me a not a number result
        System.out.println(decimal % 0f);
        System.out.println(Math.round(decimal));
        System.out.print((int) (decimal + 0.5));
    }
}