package ChapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 1;
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        while (grade !=1) {
            total = total+ grade;
            counter++;
            System.out.print("Enter grade  or -1 to quit: ");
            grade = input.nextInt();
        }
        if(counter!=0){
            double average =(double) total /counter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",counter,total);
            System.out.printf("class average is %.2f%n",average);
        }
        else{
            System.out.println("No grades were entered");
        }
    }
}
