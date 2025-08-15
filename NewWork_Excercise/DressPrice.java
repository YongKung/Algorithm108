import java.util.Scanner;

public class DressPrice{
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);

        double price , number , discount , totalCost , discountAmount , totalPay;

        System.out.print("Enter price of one dress : ");
        price = input.nextDouble();

        System.out.print("Enter number of dresses to buy : ");
        number = input.nextDouble();

        System.out.print("Enter discount rate : ");
        discount = input.nextDouble();

        totalCost = price * number ;
        discountAmount = totalCost * ( discount / 100 ) ;
        totalPay = totalCost - discountAmount ;

        System.out.println("Total cost = " + totalCost + " Baht");

        System.out.println("DiscountAmount = " + discountAmount + " Baht");

        System.out.println("Net Pay = " + totalPay + " Baht");
    }
}