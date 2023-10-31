package resources;

import java.util.Scanner;

/**
 * Add the digits of a number and print the answer.
 * Print -1 for invalid inputs(i.e., single digit numbers and negative numbers
 * Also, write another method to check if the user-defined method validates inputs correctly
 */

public class DigitSumChallenge_4 {
    public static void main(String[] args) {
        //Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        //    sumDigits(number);
        //    int testArray[]={1,-9};
        //    for (int i=0;i<testArray.length;i++){
        testSumDigits(number);
        // }
        //close Scanner object
        scanner.close();
    }

    //method to test sumDigits method
    private static void testSumDigits(int number) {

        //calling sumDigits method inside the test method to add digits of the input number
        boolean validInput = sumDigits(number);

        //if and else-if to check sumDigits method returns 'FALSE/-1' for invalid user input
        if (number / 10 == 0 || Integer.signum(number) == -1 && !validInput) {
            System.out.println("Yey! The sumDigits method is working fine.");
        } else if (number / 10 != 0 && validInput) {
            System.out.println("Yey! The sumDigits method is working fine.");
        }

        //if the sumDigits method returns validInput 'TRUE' for invalid input sumDigits method is wrong
        else {
            System.out.println("Oops! Your method is taking wrong type of inputs.");
        }
//        if(!validInput)
//
//        }
//        else{
//            System.out.println("Oops! your method is taking wrong type of inputs.");
//        }
    }

    //the static method to add digits of the number
    public static boolean sumDigits(int num) {
        //validate if the number is single digit or negative
        if (num / 10 == 0 || Integer.signum(num) == -1) {
            System.out.println("-1 : Invalid input");
            return false;
        } else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            System.out.println("The sum of digits is: " + sum);
            return true;
        }
    }

}
