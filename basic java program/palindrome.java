



// for both reversed and palindrome


import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int a = sc.nextInt();
        int c = a;
        int r =0;
        while(c!=0){
            
            int b = c%10;
            r = (r *10)+ b;
            c /= 10;
            

        }
        System.out.println("reversed NUmber"+r);
        if(r==a){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        
    }
}
