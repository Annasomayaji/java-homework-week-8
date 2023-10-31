package resources;

/**
 * Write a
 * program in Java to display the pattern like a triangle with a number.
 */
public class NumberTriangle_6 {

    public static void main(String[] args) {
        //call the user-defined method to print
        printNumberTriangle();
    }

    //static user-defined method to print the required number pattern
    public static void printNumberTriangle() {
        //nested for-loop
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //add a new line after each inner for-loop
            System.out.println();
        }

    }

}
