import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    

    System.out.print("ใส่รัศมีวงกลม (เมตร): ");
    int Raduis = input.nextInt();    
        
    int Area=( 22 / 7 ) * Raduis * Raduis ;

    System.out.print("พื้นที่วงกลม = " + Area + " ตารางเมตร");

    }
}