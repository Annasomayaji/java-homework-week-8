package resources;

import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean
 */

public class PalindromeNumber_5 {
    public static void main(String[] args) {
        //Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        //call the method to determine if the input number is a palindrome
        boolean palindrome = isPalindrome(scanner.nextInt());
        if (palindrome)
            System.out.println("The entered number is a palindrome");
        else
            System.out.println("The entered number is NOT a palindrome");

        //close Scanner object
        scanner.close();
    }

    public static boolean isPalindrome(int originalNumber) {
        int reverse = 0, lastDigit = 0;

        //assign original number to another variable to work with,
        // so that the original number is preserved for comparison at the end
        int number = originalNumber;

        while (number != 0) {

            //extract the last digit and add it to reverse variable
            lastDigit = number % 10;
            reverse = reverse + lastDigit;

            //increase the place value
            reverse = reverse * 10;

            //discard the last digit
            number = number / 10;
        }

        //get rid of the last zero added by increasing the place value at the end of the while loop (*imp)
        reverse = reverse / 10;

        //compare the reverse and original number and return result
        if (reverse == originalNumber)
            return true;
        else
            return false;
    }
}
