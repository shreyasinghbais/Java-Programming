import java.util.Scanner;

public class RightHalfPyramidReverse {
    
    public static void printRightHalfPyramidReverse(int n){
        int i, j;
        for(i=n; i>0; i--){
            for(j=0; j<i; j++){ 
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int x = io.nextInt();
        printRightHalfPyramidReverse(x);
        io.close();
    }
}
//Output will look like:
// *****
// ****
// ***
// **
// * 

