import java.util.Scanner;

public class Sum{
    public static void main(String args[]){

        // int num1 = 4;

        // int num2 = 6;


        Scanner scanner = new Scanner(System.in);

        System.out.print("ใส่ตัวเลขที่ 1 : ");
        int num1 = scanner.nextInt();

        System.out.print("ใส่ตัวเลขที่ 2 : ");
        int num2 = scanner.nextInt();

        int sum=num1+num2;


        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);




    }
}