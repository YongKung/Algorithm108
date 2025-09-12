
import java.util.Scanner;

public class BMRCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = input.next().charAt(0);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (cm): ");
        double height = input.nextDouble();

        System.out.print("Enter your age (years): ");
        int age = input.nextInt();

        double bmr = 0;

        if (gender == 'M' || gender == 'm') {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (gender == 'F' || gender == 'f') {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            System.out.println("Invalid gender input!");
            input.close();
            return;
        }

        System.out.println("Your BMR is: " + bmr);

    }
}
