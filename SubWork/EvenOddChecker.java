import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //รับค่าจากผู้ใช้
        System.out.print("ใส่ตัวเลขเพื่อเช็คเลขคู่หรือคี่ : ");
        int Number = scanner.nextInt();

        // if ต้องบอกเงื่อนไขใน () แล้วบอกการกระทำใน {}
        if(Number % 2 != 0/*ถ้าคิดเฉพาะเศษให้เลือก %*/) { 
            System.out.print(Number + " เป็นเลขคี่"); 
        } else {
            System.out.print(Number + " เป็นเลขคู่");        
            }
    }
}
