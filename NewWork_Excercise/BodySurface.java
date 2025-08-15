import java.util.Scanner;

public class BodySurface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float Length, Width, BSA;

        System.out.print("Enter your length in centimeters : ");
        Length = input.nextFloat();

        System.out.print("Enter your height in kilograms : ");
        Width = input.nextFloat();

        BSA = (Length * Width) / 360;
        System.out.println("Your body surface is : " + BSA + " square meter");
    }
}
