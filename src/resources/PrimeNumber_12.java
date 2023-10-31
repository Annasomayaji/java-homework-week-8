package resources;

import java.util.Scanner;

/**
 * Write a program to check if a number is prime number or not
 */
public class PrimeNumber_12 {
    public static void main(String[] args) {
        //Instantiate a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        //call the method to check if the number is prime number
        isPrimeNumber(scanner.nextInt());

        //close scanner object
        scanner.close();
    }

    //Static method to check for prime numbers
    public static void isPrimeNumber(int num) {
        //label the outer loop to break out
        boolean isPrime=true;
        outerloop:
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                isPrime = false;
                break outerloop;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        }

    }

}
