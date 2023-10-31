package resources;

import java.util.Scanner;

/**
 * Write a program to get the sum of even digits in a number
 */
public class EvenDigitSum_11 {

    public static void main(String[] args) {
        //Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int answer = getEvenDigitSum(scanner.nextInt());
        if (answer == -1)
            System.out.println("-1, Negative number.");
        else
            System.out.println("The sum of even digits is: " + answer);
        //close Scanner object
        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        int lastDigit = 0, sum = 0;
        if (Integer.signum(number) == -1)
            return -1;
        else {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                number = number / 10;
            }
            return sum;
        }

    }
}
