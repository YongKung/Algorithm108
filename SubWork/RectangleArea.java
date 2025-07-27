import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //ตัวแปร
        double Width , Length ,Area ;

        //รับค่าจากผู้ใช้
        System.out.print("ใส่ความสูงของสี่เหลี่ยม(ซม.) : ");
        Width = scanner.nextDouble();

        System.out.print("ใส่ความกว้างของสี่เหลี่ยม(ซม.) : ");
        Length = scanner.nextDouble();

        Area= Width * Length ;

        System.out.print("พื้นที่ของสี่เหลี่ยมคือ : " + Area + "ตร.ซม.");
    }
    
}