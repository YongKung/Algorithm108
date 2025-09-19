import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // รับคะแนน
        System.out.print("Enter score (0-100): ");
        int score = input.nextInt();

        String grade;

        // ตรวจสอบว่าคะแนนเกินช่วงหรือไม่
        if (score < 0 || score > 100) {
            System.out.println("Huh!! This is real your score!!");
            return;
        }

        // การให้เกรดตามเงื่อนไข
        if (score >= 80)

        {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // แสดงผลลัพธ์
        System.out.println("\n--- Result ---");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
