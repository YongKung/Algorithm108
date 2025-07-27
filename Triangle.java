import java.util.Scanner;

public class Triangle {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //ตัวแปร
        double Height , Base , Area ;
         

        //รับค่า
        System.out.print("ใส่ความสูงของสามเหลี่ยม(เมตร): ");
        Height = scanner.nextInt();

        System.out.print("ใส่ความกว้างของฐานสามเหลี่ยม(เมตร): ");
        Base = scanner.nextInt();

        //คำนวณ
        Area = 0.5 * Base * Height  ;

        System.out.print("พื้นที่ของสามเหลี่ยมคือ : " + Area + "ตารางเมตร");
    }
}
