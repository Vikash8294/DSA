import java.util.*;
public class binary {
    public static void  calDecToBin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number");
        int decNum = sc.nextInt();
        int power = 1;
        int ans =0;
        while(decNum >0){
            int rem = decNum%2;
            decNum = decNum/2;
            ans = ans + rem * power;
            power = power *10;
            

            
        }
        System.out.println("The Converted Binary Number of "+decNum+" is "+ans);

    }
    public static void main(String[] args) {
        calDecToBin();
     
    }
}
