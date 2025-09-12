
import java.util.Scanner;

public class noteChange_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int change, amountPay, fiveHundred, hundred, fifty, twenty, tenCoin, fiveCoin, twoCoin, oneCoin,price, quantity, totalPay;
        int moneyHave = 1000; // ลูกค้ามีแบงค์พัน 1 ใบ

        // รับราคาสินค้า
        System.out.print("Enter price per item: ");
        price = input.nextInt();

        // รับจำนวนสินค้า
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // คำนวณยอดเงินที่ต้องจ่าย
        totalPay = price * quantity;
        amountPay = totalPay;

        // ตรวจสอบเงินพอไหม
        if (amountPay > moneyHave) {
            System.out.println("Not enough money!!");
        } else {
            // คำนวณเงินทอน
            change = moneyHave - amountPay;
            System.out.println("Change is : " + change + " baht");

            // คำนวณจำนวนธนบัตรและเหรียญ
            fiveHundred = change / 500;
            change = change % 500;

            hundred = change / 100;
            change = change % 100;

            fifty = change / 50;
            change = change % 50;

            twenty = change / 20;
            change = change % 20;

            tenCoin = change / 10;
            change = change % 10;

            fiveCoin = change / 5;
            change = change % 5;

            twoCoin = change / 2;
            change = change % 2;

            oneCoin = change; // ที่เหลือคือเหรียญ 1 บาท

            System.out.println("Five-hundred note: " + fiveHundred + " note(s)");
            System.out.println("Hundred note: " + hundred + " note(s)");
            System.out.println("Fifty note: " + fifty + " note(s)");
            System.out.println("Twenty note: " + twenty + " note(s)");
            System.out.println("Ten coin: " + tenCoin + " coin(s)");
            System.out.println("Five coin: " + fiveCoin + " coin(s)");
            System.out.println("Two coin: " + twoCoin + " coin(s)");
            System.out.println("One coin: " + oneCoin + " coin(s)");
        }
    }
}
