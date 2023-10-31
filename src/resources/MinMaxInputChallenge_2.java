package resources;

import java.util.Scanner;

/**
 * Write a Java program to read the number from the console and print
 * the maximum and minimum number the user
 * has entered
 * 2hrs!!!
 */
public class MinMaxInputChallenge_2 {

    static int max = 0;
    static int min = 0;

    public static void main(String[] args) {
        int num = 0;
        //create Scanner object to get input from console
        Scanner scanner = new Scanner(System.in);
        //infinite while loop for scanner input
        while (true) {
            System.out.println("Please enter number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Terminating.....");
                break;
            } else {
                num = scanner.nextInt();
                //Call method to classify input as minimum or maximum
                minMaxNumber(num);
            }

        }
        //Close Scanner object
        if (!scanner.hasNext()) {
            scanner.close();
        }
    }

    //user defined method for classifying the input into maximum or minimum
    public static void minMaxNumber(int num) {
        if (min == 0 && max == 0) {
            min = num;
            max = num;
        } else if (num < min) {
            min = num;
        } else if (num > max) {
            max = num;
        }
        System.out.println("the minimum number is: " + min + " and the maximum is " + max);

    }
}


