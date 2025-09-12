
import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // กำหนดตัวแปร
        int number1, number2, temp;

        // รับค่าจากผู้ใช้
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        number2 = input.nextInt();

        // แสดงค่าก่อนสลับ
        System.out.println("Current -> number1 = " + number1 + " and number2 = " + number2);
        System.out.println("Swapping ............");

        // สลับค่าด้วยตัวแปร temp
        temp = number1;
        number1 = number2;
        number2 = temp;

        // แสดงค่าหลังสลับ
        System.out.println("Now -> number1 = " + number1 + " and number2 = " + number2);
    }
}
