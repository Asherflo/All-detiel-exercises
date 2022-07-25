package ChapterFour;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int product = 3;
        while (product<=100){
            product = 3* product;
            System.out.println(product);
        }
        System.out.println();
        System.out.println();


        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10){
            System.out.println("Enter your grade: ");
            int grade = input.nextInt();
            total = total +grade;
            gradeCounter++;
        }
        int average = total /10;
        System.out.println("the total of all grade is "+ total);
        System.out.println("the average oof all number "+ average);
    }

}
