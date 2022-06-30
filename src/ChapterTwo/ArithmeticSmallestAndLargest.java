package ChapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int sum =firstNumber + secondNumber +thirdNumber;
        int average = firstNumber + secondNumber +thirdNumber % 3;
        int product = firstNumber * secondNumber * thirdNumber;

        System.out.println("the sum of the integer is : " + sum);
        System.out.println("the average of the integer is : "+ average);
        System.out.println("the product of the integers is :" +product);


    }
}
