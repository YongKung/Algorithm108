import java.util.Scanner;

public class TemperatureStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าอุณหภูมิ
        System.out.print("Enter temperature in Celsius: ");
        double temp = input.nextDouble();

        String status;

        // การตรวจสอบเงื่อนไข
        if (temp < 20) {
            status = "Cold";
        } else if (temp <= 35) {
            status = "Normal";
        } else {
            status = "Hot";
        }

        System.out.println("Temperature: " + temp + "°C");
        System.out.println("Status: " + status);
    }
}
