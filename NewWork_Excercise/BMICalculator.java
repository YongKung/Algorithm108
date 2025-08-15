import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        float Weight, Height, BMI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms : ");
        Weight = input.nextFloat();

        System.out.print("Enter your height in meters : ");
        Height = input.nextFloat();

        BMI = Weight / (Height * Height);
        
        System.out.println("Your BMI for weight = "+ Weight +"kg"+" and height = "+ Height +"meters is : " + BMI + " bmi");
    }
}
