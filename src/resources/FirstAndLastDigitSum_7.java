package resources;

import java.util.Scanner;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */
public class FirstAndLastDigitSum_7 {
    static boolean valid = false;

    public static void main(String[] args) {

        //create scanner object to read console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        //Call the method to add first and last digit and send console input as argument
        while (!valid) {
            boolean valid = sumFirstAndLastDigit(scanner.nextInt());
        }

        //close scanner object
        scanner.close();
    }

    public static boolean sumFirstAndLastDigit(int number) {

        int lastDigit=0, firstDigit=0;

        //Check for negative numbers and accept another number from console
        if (Integer.signum(number) == -1) {
            System.out.println("-1. Negative number. Enter a number again.");
            return false;
        } else {
            //Extract the last digit of the original number
            lastDigit = number % 10;

            //discard the last digit and save the modulus until the first digit is obtained
            while (number != 0) {
                firstDigit = (number % 10);
                number = number / 10;
            }
            //add the first and last digits and print
            System.out.println("Sum of the first and last digit is: " + (firstDigit + lastDigit));
            return true;
        }
    }
}
