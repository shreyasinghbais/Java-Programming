import java.util.Scanner;

public class HollowSquare {

    public static void printHollowSquare(int n){
        int i, j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int x = io.nextInt();
        printHollowSquare(x);
        io.close();
    }
}
//Output will look like:
// ****
// *  *
// *  *
// ****