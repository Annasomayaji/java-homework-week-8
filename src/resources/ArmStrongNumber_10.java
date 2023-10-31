package resources;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class ArmStrongNumber_10 {
    public static void main(String[] args) {
        //create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        //call the method to check for armstrong number
        isArmStrongNumber(scanner.nextInt());
        //close the Scanner object
        scanner.close();
    }

    //static method to check if a number is Armstrong number or not
    public static void isArmStrongNumber(int number) {
        int originalNumber = number;
        int num = 0, answer = 0;
        while (number > 0) {
            num = number % 10;
            answer = answer + num * num * num;
            number = number / 10;
        }
        if (answer == originalNumber) {
            System.out.println("Yes! The number is an Armstrong number.");
        } else {
            System.out.println("No! The number is NOT an Armstrong number");
        }
    }

}
