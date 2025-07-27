import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int Current_Year = 2025;
        int BirthYear, Age;

        // รับปีเกิดจากผู้ใช้
        System.out.print("กรุณาใส่ปีเกิดของคุณ(ค.ศ.): ");
        BirthYear = scanner.nextInt();

        // คำนวณอายุ
        Age = Current_Year - BirthYear;

        // แสดงผลลัพธ์
        System.out.println("คุณอายุ " + Age + " ปี");

    }
}