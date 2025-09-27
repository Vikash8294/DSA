
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        // by using thrid varialbe*********************************


        // int a = 2;
        // int b = 3;
        // int t = a ;
        // a = b;
        // b = t;
        // System.out.println("Swap A is" +a);
        // System.out.println("Swap B is" +b);


        //*********************Withou using third variable */


        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter first number");
        int A =  sc.nextInt();
        System.out.println( "Enter first number");
        int B =  sc.nextInt();
        System.out.println( "Before swapping  A is :" +A);
        System.out.println( "Before swapping  B is :" +B);

        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println( "After swapping  A is :" +A);
        System.out.println( "After swapping  B is :" +B);





    }
    
}
