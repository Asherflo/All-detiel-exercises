package ChapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double radius =scanner.nextFloat();
        System.out.println("Area of circle");
        double area = Math.PI * radius * radius;
        System.out.println("To calculate the diameter of a circle");
        double diameter = 2 * radius;
        System.out.println("To calculate the circumference of circle");
        double circumference = 2*Math.PI * radius;

        System.out.printf("The Area of a circle is %f%n",area,"The diameter of a circle is %f%n",diameter ,
                "The circumference is %f",circumference);

    }
}
