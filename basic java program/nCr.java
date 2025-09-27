import java.util.Scanner;

public class nCr {
    public static int calFactorial(int n){
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc. nextInt();
        System.out.println("enter the r");
        int r = sc. nextInt();
        int fact = calFactorial(n);
        int factr = calFactorial( r);
        int factnr = calFactorial(n-r);
        // System.out.println("The factorial of  "+n+"  is :"+fact);
        System.out.println("nCr is :"+(fact/(factr *factnr)));
        
    }
    
}
