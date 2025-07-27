import java.util.Scanner;

public class Pencil {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("ใส่จำนวนกล่อง: ");
        int Box = input.nextInt();

         System.out.print("ใส่ดินสอต้อจำนวนกล่อง 1 ใบ: ");
        int Pencil = input.nextInt();

        int Total=Box*Pencil;

        System.out.print("จำนวนดินสอที่มีทั้งหมด: " + Total + " แท่ง");
    }
}
