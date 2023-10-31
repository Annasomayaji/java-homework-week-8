package resources;

import java.util.Scanner;

/**
 * Write a Java program to take user input and output if it is a vowel or consonant
 * if the user input is not a letter (a-z,A-Z) or inputs a string of lenght>1, print an error message
 */

public class isVowelOrConsonant_3 {
    public static void main(String[] args) {
        boolean rightInput = true;
        //Create Scanner object to get input from console
        Scanner scanner = new Scanner(System.in);
        //do while loop to continue getting console input until correct format is entered
        do {
            System.out.println("Please enter a character: ");
            String input = scanner.nextLine();
            isVowelOrConsonant_3 obj = new isVowelOrConsonant_3();
            //call user defined method to verify the inout
            rightInput = obj.checkLetterVowelOrConsonant(input);
        } while (!rightInput);
        //Close Scanner object  
        scanner.close();
    }

    //Instance method to verify the input
    public boolean checkLetterVowelOrConsonant(String input) {
        //if condition to return false for invalid inputs
        if (input.length() > 1) {
            System.out.println("You have entered a string!");
            return false;
        } else if (!Character.isLetter(input.charAt(0))) {
            System.out.println("You have entered an invalid input!");
            return false;
        } else {        //when the input is valid check the type
            switch (input.charAt(0)) {
                case 'a':
                    System.out.println("You have entered a VOWEL: " + 'a');
                    break;
                case 'e':
                    System.out.println("You have entered a VOWEL: " + 'e');
                    break;
                case 'i':
                    System.out.println("You have entered a VOWEL: " + 'i');
                    break;
                case 'o':
                    System.out.println("You have entered a VOWEL: " + 'o');
                    break;
                case 'u':
                    System.out.println("You have entered a VOWEL: " + 'u');
                    break;
                default:
                    System.out.println("You entered a CONSONANT: " + input.charAt(0));
            }
            //return true to exit the do while loop in the main method
            return true;

        }
    }
}
