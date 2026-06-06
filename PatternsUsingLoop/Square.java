import java.util.Scanner;

public class Square {
    public static void printSquare(int n){
        int i, j;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){ 
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int x = io.nextInt();
        printSquare(x);
        io.close();
    }
}
//Output will look like:
// ****
// ****
// ****
// ****

