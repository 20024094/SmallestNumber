package smallestnumber;

/**
 *
 * @author 20024094
 */

import java.util.Scanner;


public class SmallestNumber {
    
    public SmallestNumber() {
        resultMin();
    }
    
    public static void main(String[] args) {
        new SmallestNumber();
    }
    
    public static int smallest(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }
    
    public void resultMin() {
        Scanner in = new Scanner(System.in);
        System.out.print("First number: ");
        int x = in.nextInt();
        System.out.print("Second number: ");
        int y = in.nextInt();
        System.out.print("Third number: ");
        int z = in.nextInt();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );  
    }
    
}
