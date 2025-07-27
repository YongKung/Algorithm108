import java.util.Scanner;

public class Total_tax {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("ใส่จำนวนเงินเดือน (บาท): ");
        double Salary = input.nextInt();

        System.out.print("อัตราภาษี (%): ");
        int Tax = input.nextInt();

        double Total_Paid= Salary * (Tax/100.0) ;
        /*ย้ำการคูณถ้าใส่วงเล็บแล้วตัวแปรใส่ int มันจะกลายเป็น int/int = 0 เพราะมันปัดเศษให้เป็นค่าคงที่*/

        System.out.println("จำนวนเงินที่ต้องจ่ายภาษี: " + Total_Paid + " บาท");
    }
}
