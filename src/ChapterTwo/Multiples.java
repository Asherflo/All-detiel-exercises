package ChapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int  number1 = input.nextInt();
        System.out.println("enter the second number");
        int number2 = input.nextInt();
        int firstNumber = number1 * number1 * number1;
        int secondNumber = number2 * number2;
        if (firstNumber % secondNumber == 0){
            System.out.println("the first number tripled is  a multiple of second number");
        }else System.out.println("the first number tripled is  not a multiple of second number");
    }
}
