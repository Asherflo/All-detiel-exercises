package ChapterTwo;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();

        if(number % 3 == 0){
            System.out.println("number is divisible by 0");
        }
        else System.out.println("number is not divisible by 0");
    }
}
