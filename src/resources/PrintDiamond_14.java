package resources;

/**
 * Write a program to display a pattern like a diamond
 */
public class PrintDiamond_14 {
    public static void main(String[] args) {
        printDiamondPattern();
    }

    public static void printDiamondPattern() {
        int number=7;
        int m=1;
        int n;
        //number of rows required
        while(m<=number){
            n=1;
            //Print required number of spaces before the *
            while(n++ <=number-m){
                System.out.print(" ");

            }
            //assign 1 to n again
            n=1;
            //print required number of stars
            while(n++ <=m*2-1){
                System.out.print("*");

            }
            //add a new lin after the row
            System.out.println();
            m++;
        }
        m=number-1;
        while(m>0){
            n=1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n=1;
            while (n++ <=m*2-1){
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
}
