package resources;

public class LeftAngledTriangle_15 {
    public static void main(String[] args) {
        int num = 4, m = 1;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= num - m; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" @ ");
            }
            if (m != 4) {
                m++;
            }
            else{
                m--;
            }
            //add a new line after every row
            System.out.println();
        }
    }
}
