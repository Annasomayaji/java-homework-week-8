package resources;
/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class FibonacciNumber_9 {
    public static void main(String[] args) {
        //create Scanner object to take console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many digits would you like to print:");

        //read the input from the console and call the print Fibonacci method
        printFibonacci(scanner.nextInt());
        //close Scanner object
        scanner.close();
    }

    //static method to print fibonacci series of required number of digits
    public static void printFibonacci(int digits) {
        //first two numbers in the series assigned values
        int number1 = 0;
        int number2 = 1;
        System.out.print(number1 + " " + number2);

        //logic for adding previous two digits to get the third digit
        int number = 0;
        for (int i = 3; i <= digits; i++) {
            number = number1 + number2;
            System.out.print(" " + number);
            number1 = number2;
            number2 = number;
        }
    }
}
