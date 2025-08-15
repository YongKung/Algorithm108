import java.util.Scanner;

public class FahrenheitToCelsiusFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature in degrees Fahrenheit: ");
        float Fahrenheit = input.nextFloat();

        // ใช้ float  เพื่อให้การคำนวณเป็น float
        float Celsius = (Fahrenheit - 32.0f) * 5.0f / 9.0f;

        System.out.println("The temperature in degrees Celsius is: " + Celsius);

    }
}
