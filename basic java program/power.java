import java.util.Scanner;

public class power {
    public static int calPower(int x, int n){
        int power = 1;
        for(int i=1; i<=n; i++){
            power = power*x;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nummber");
        int x = sc. nextInt();
        System.out.println("enter the raised power");
        int n = sc. nextInt();
        int power = calPower(x,n);
        System.out.println("The Power of  "+x+" raise to "+n+" is :"+power);
        
    }
    
}
