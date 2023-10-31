package resources;

import java.util.Scanner;

/**
 * Write a program to check if two numbers share a digit
 */
public class SharedDigit_13 {
    public static void main(String[] args) {
        int number1, number2;
        boolean hasShared;
        //Instantiate Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        number1 = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = scanner.nextInt();

        //call the static method to check if numbers have shared digits
        hasShared = hasSharedDigit(number1, number2);
        System.out.println(hasShared);

        //close Scanner object
        scanner.close();
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int temp;

        //preserve first number in a variable
        int originalNumber1 = num1;

        //check for invalid number input and return false
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        } else {
            while (num2 > 0) {
                num1 = originalNumber1; //assign original num1 to num1 before restarting while-loop
                while (num1 > 0) {

                    //Compare each digit of num1 with last digit of num2. Return 'true' if equal
                    if (num1 % 10 == num2 % 10) {
                        return true;
                    }
                    num1 /= 10;
                }
                //Discard the last digit of num2 and repeat the while-loop for the new last digit
                num2 /= 10;
            }
            return false;
        }
    }
}
