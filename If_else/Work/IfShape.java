
import java.util.Scanner;

public class IfShape {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1 for triangle area, 2 for BMI): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the base of the triangle: ");
            double base = input.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = input.nextDouble();

            double area = 0.5 * base * height;
            System.out.println("Area of the triangle: " + area + " square units");

        } else if (choice == 2) {
            System.out.print("Enter your weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = input.nextDouble();

            double bmi = weight / (height * height);
            System.out.println("Your BMI for weight = " + weight + " kg and height = " + height + " meters is: " + bmi + " BMI.");

        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }
}
