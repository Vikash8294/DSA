import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int original = n;
        int aws = 0;

        while(n>0){
            int r = n%10;
            int power = 1;
            for(int i =1; i<=3; i++){
                power = power * r;
            }
            aws = aws + power;
            n = n/ 10;
        }
        System.out.println("The output of number is " +aws + " So ,");
        if(aws == original){
            System.out.println(original+" is Armstrong Number");
        }
        else{
            System.out.println(original+" is Not a Armstrong Number");

        }
        
    }
}
