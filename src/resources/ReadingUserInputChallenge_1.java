package resources;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * 1hr
 */

public class ReadingUserInputChallenge_1 {

    public static void main(String[] args) {

        boolean invalid = false;
        int counter = 0;
        int answer = 0;
        //declare array to store input from console before passing it to user-defined method
        int[] numberArray = new int[10];
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        //while loop to take 10 values from console
        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1) + ":");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input!");
                //if invalid input break out of the loop
                invalid = true;
                break;
            } else {
                //store console input in array
                numberArray[counter] = scanner.nextInt();
                counter++;
            }
            //call return type method to add inputs
            answer = addNumbers(numberArray);
        }
        //Print the sum only all console inputs are valid
        if (!invalid) {
            System.out.println("The total of " + counter + " numbers is :" + answer);
        }
        //close scanner object
        scanner.close();

    }

    //return type method to iterate through the array argument and add
    public static int addNumbers(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
}
