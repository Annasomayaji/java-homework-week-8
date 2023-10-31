package resources;

/**
 * Display right angle triangle of @ using nested for loop
 */
public class SymbolTriangle_8 {
    public static void main(String[] args){
        printTriangle();

    }

    //static method to print the triangle
    public static void printTriangle(){

        //nested for-loop to iterate through rows and columns
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }

            //add a new line after every row
            System.out.println();
        }
    }
}
