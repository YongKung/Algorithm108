import java.util.Scanner;

//เบลอไม่รู้ทำทำไม

public class SumAndAverage {
    public static void main(String[] args) {
        // สร้าง Scanner เพื่อรับค่าจากผู้ใช้
        Scanner scanner = new Scanner(System.in);

        // ประกาศตัวแปร
        int num1, num2, num3, num4, num5;
        int sum;
        double average;

        // รับค่าจากผู้ใช้
        System.out.print("ป้อนเลขตัวที่ 1: ");
        num1 = scanner.nextInt();

        System.out.print("ป้อนเลขตัวที่ 2: ");
        num2 = scanner.nextInt();

        System.out.print("ป้อนเลขตัวที่ 3: ");
        num3 = scanner.nextInt();

        System.out.print("ป้อนเลขตัวที่ 4: ");
        num4 = scanner.nextInt();

        System.out.print("ป้อนเลขตัวที่ 5: ");
        num5 = scanner.nextInt();

        // คำนวณผลรวม
        sum = num1 + num2 + num3 + num4 + num5;

        average = sum / 5.0;

        // แสดงผล
        System.out.println("ผลรวม = " + sum);
        System.out.println("ค่าเฉลี่ย = " + average);
    }
}