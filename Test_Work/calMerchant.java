
import java.util.Scanner;

public class calMerchant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // กำหนดตัวแปร
        double pricePerUnit, totalPrice;
        int quantity;

        // รับราคาต่อชิ้น
        System.out.print("Enter the price of the product (per unit): ");
        pricePerUnit = input.nextDouble();

        // รับจำนวนสินค้า
        System.out.print("Enter the quantity of the product: ");
        quantity = input.nextInt();

        // คำนวณราคารวม
        totalPrice = pricePerUnit * quantity;

        // ตรวจสอบว่าควรลดราคาหรือไม่
        if (quantity > 10) {
            System.out.println("You get a 10% discount!");
            totalPrice = totalPrice * 0.9;  // ลด 10%
        }

        // แสดงผลลัพธ์
        System.out.println("Total price: " + totalPrice + " Baht");
    }
}
