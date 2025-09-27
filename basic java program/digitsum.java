import  java.util.*;
public class digitsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int sum =0;
        int original = num;
        int reve =0;
        
        while(num>0){
            int digit = num%10;
            sum = sum+ digit;
            reve = (reve*10)+digit;
            num = num/10;
            
            
        }
        System.out.println(reve);
        if( original == reve){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        System.out.println("The Sum of Digit of "+original+" is : "+ sum);

    }
    
}
