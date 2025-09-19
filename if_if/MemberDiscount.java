import java.util.Scanner;

public class MemberDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        System.out.print("Enter membership level (Silver, Gold, Platinum): ");
        String level = scanner.nextLine();

        System.out.print("Enter total purchase amount: ");
        double total = scanner.nextDouble();

        double discountRate;

        if (level.equalsIgnoreCase("Silver")) {
            discountRate = 0.05;
        } else if (level.equalsIgnoreCase("Gold")) {
            discountRate = 0.10;
        } else if (level.equalsIgnoreCase("Platinum")) {
            discountRate = 0.15;
        } else {
            discountRate = 0.0;
        }

        double discount = total * discountRate;
        double finalPrice = total - discount;

        System.out.println("\n--- Receipt ---");
        System.out.println("Member level: " + level);
        System.out.printf("Total purchase: %.2f%n", total);
        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final price: %.2f%n", finalPrice);
    }
}