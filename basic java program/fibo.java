import java.util.Scanner;

public class fibo {
    public static void calFibonacciSeries(int n){
        int f = 1;
        int s =1;
        int t;
        System.out.print(f+" ");
        System.out.print(s+" ");

        for(int i=3; i<=n; i++){
            t = f+s;
            f=s;
            s=t;
            System.out.print(t+" ");
        }
       
        
       
       
        
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nummber");
        int n = sc. nextInt();
        System.out.println("The Value of  FibonacciSeries tiil "+n+" is :");
        calFibonacciSeries(n);
        
        
    }
}