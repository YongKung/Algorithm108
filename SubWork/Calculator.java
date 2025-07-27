import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        // รับค่าตัวเลขจากผู้ใช้
        System.out.print("ป้อนตัวเลขตัวที่ 1: ");
        num1 = scanner.nextDouble();

        System.out.print("ป้อนตัวเลขตัวที่ 2: ");
        num2 = scanner.nextDouble();

        // คำนวณและแสดงผล
        System.out.println("ผลบวก: " + (num1 + num2));
        System.out.println("ผลลบ: " + (num1 - num2));
        System.out.println("ผลคูณ: " + (num1 * num2));

        // ตรวจสอบกรณีหารด้วย 0
        if (num2 != 0) {
            System.out.println("ผลหาร: " + (num1 / num2));  // แสดงทศนิยม 2 ตำแหน่ง
        } else {
            System.out.println("ผลหาร: ไม่สามารถหารด้วยศูนย์ได้");
            }

    }
}