package ChapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        int numberSquared  = number* number;

        if(number > 100 && numberSquared > 100){
            System.out.println("The unknown number is greater than 100");
        }
        if(number < 100 && numberSquared < 100){
            System.out.println("The unknown number is less than 100");
        }
        if( number == 100 && numberSquared == 100){
            System.out.println("The unknown number is equal to 100");
        }
        if( number != 100 && numberSquared != 100){
            System.out.println("The unknown number is not equal to 100");
        }


    }
}
