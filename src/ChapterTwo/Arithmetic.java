package ChapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        int squaredOfFirstInteger = firstInteger * firstInteger;
        int squaredOfSecondInteger = secondInteger * secondInteger;

        int sumOfSquares = squaredOfFirstInteger + squaredOfSecondInteger;
        int differenceOfInteger =squaredOfFirstInteger -squaredOfSecondInteger;

//        System.out.println(firstInteger);
//        System.out.println(secondInteger);
//        System.out.println(squaredOfFirstInteger);
//        System.out.println(squaredOfSecondInteger);
//        System.out.println(sumOfSquares);
//        System.out.println(differenceOfInteger);


        System.out.printf("%d%n%d%n %d%n%d%n %d%n%d",firstInteger,secondInteger,squaredOfFirstInteger,squaredOfSecondInteger,sumOfSquares,differenceOfInteger);



    }
}
