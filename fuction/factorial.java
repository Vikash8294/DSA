import java.util.Scanner;

public class factorial {
    public static int calFactorial(int num){
        int fact = 1;
        for(int i=num; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nummber");
        int num = sc. nextInt();
        int fact = calFactorial(num);
        System.out.println("The factorial of  "+num+"  is :"+fact);
        
    }
    
}
