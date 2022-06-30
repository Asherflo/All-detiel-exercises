package ChapterTwo;

import java.util.Scanner;

public class SeparatingTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a five digit number: ");
        int number = input.nextInt();

        int firstNumber = number /10000;
        int secondNumber = (number % 10000) /1000;
        int thirdNumber = (number % 1000) /100;
        int fourthNumber = (number %100)/10;
        int fifthNumber =number % 10 ;
        System.out.print(firstNumber + " "+ secondNumber +" "+thirdNumber+ " "+ fourthNumber+" "+fifthNumber);
    }
}
