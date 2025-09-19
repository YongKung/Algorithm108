import java.util.Scanner;

public class teaspoonIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;// กำหนดตัวแปร

        // รับค่าอายุ
        System.out.print("Enter your Age : ");
        age = input.nextInt();

        if (age > 10) {
            System.out.println("Take 2 teaspoons");
        } else if (age >= 3) {
            System.out.println("Take 1 teaspoons");
        } else if (age >= 1) {
            System.out.println("Take 1/2 teaspoons");
        } else if (age < 0) {// ถ้าอายุติดลบ
            System.out.println("Huh!! You Age is so Suspect!!");
        } else {
            System.out.println("Do not take medicine");// อายุเป็น 0

        }
    }
}
