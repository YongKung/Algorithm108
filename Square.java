import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Width, Length, Area;

        System.out.print("ป้อนความกว้าง: ");
        Width = scanner.nextDouble();

        System.out.print("ป้อนความยาว: ");
        Length = scanner.nextDouble();

        Area = Width * Length;

        System.out.println("พื้นที่สี่เหลี่ยม = " + Area);

    }
}