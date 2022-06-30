package ChapterTwo;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds or in inches: ");
        double weight = input.nextInt();
        System.out.println("Enter your height in inches or meters: ");
        double height = input.nextInt();
         double calculator =   weight * 703/height * height;
        System.out.println("your Body Mass Index: " +calculator);
        if(calculator  <18.5){
            System.out.println("underweight,improve on your health and diet");
        }
        else if (calculator <=24.9){
            System.out.println("normal weight,keep it up");
        } else if (calculator <=29.9) {
            System.out.println("overweight,you need to visit the gym soon dear and also eat a proper diet ");
        }
            System.out.println("OBESITY!!,watch it");


    }
}
