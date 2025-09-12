import java.util.Scanner;

public class Singleif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int Number = input.nextInt();

        if (Number > 0) {
            System.out.println("It is positive number");
        }
        System.out.println("End Program");
    }
}