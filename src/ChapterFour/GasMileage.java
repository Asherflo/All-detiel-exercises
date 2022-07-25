package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;

        System.out.print("Enter any number to start the program or -1 to exit");
        int number = input.nextInt();

        while(number !=  1){
            System.out.println("Enter the miles driven: ");
            int mile = input.nextInt();
            System.out.println("Enter the gallon used: ");
            int gallon = input.nextInt();
            int milesPerGallon =mile * gallon;
            total +=milesPerGallon;

            System.out.println("enter any number to continue program or -1 to end program ");
            number = input.nextInt();

        }

        System.out.println("the total miles per gallon used  is " + total);


    }
}
