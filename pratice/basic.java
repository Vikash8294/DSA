
import java.util.Scanner;


public class basic {

    public static void digitCount(int n) {
        int count=0;
        while(n>0){
            n = n /10;
            count = count +1;
            
        }
        System.out.println(count);

        
    }
    public static void Binary(int n) {
        int rem =0;
        int power = 1;
        while(n!=0){
            int digit = n%2;
            n = n/2;
            rem = (rem) + digit * power;
            power = power *10;
            
        }
        System.out.println(rem);

        
        
    }

    // public static void decimal(int n) {
    //     int rem =0;
    //     int power = 1;
    //     while(n!=0){
    //         int digit = n%10;
    //         n = n/10;
    //         rem = (rem) + digit * power;
    //         power = power *2;
            
    //     }
    //     System.out.println(rem);

    public static void decimal(int n) {
        int rem = 0;
        int sum = 0;
        int count = 0 ;
        while(n>0){
            int digit = n%10;
            count = count+1;
            rem = rem *10  + digit;
            n = n/10;
            sum = sum + digit;
            





        }
        System.out.println("palindrom : " +rem);
        System.out.println("sum : "+ sum);
        System.out.println("count : "+ count);

        
    }
    public static void fi(int n) {
        int f =1;
        int s= 1;
        int t ;
        System.out.println(f);
        System.out.println(s);
        for(int i =3 ; i<=n ; i++){
            t = f + s;
            f = s;
            s = t;
            System.out.println(t +" ");
        }
        
        
    }
    public static int fact(int n) {
        int fact = 1;
        for(int i =1 ; i<=n; i++){
            fact = fact *i;
        }
        return  fact;
        
        
    }

    public static void perfect(int n) {
        int org = n ;
        int sum = 0;
        for(int i =1; i<n ; i ++){
            if(n %i == 0){
                sum = sum +i;
            }

        }
        if(sum == org){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfrct");
        }
    }

    public static void power(int n) {
        int power = 1;
        for(int i =1; i<=2 ; i++){
            power = power * n ;
        }
        System.out.println(power);
    }


    public static void arm(int n) {
        int rem = 0;
        int sum =0;
        while(n != 0){
            int digit = n%10;
            int power = 1;
            for ( int i =1 ; i<=3; i++){
                power = power * digit ;
                
            }
            sum = sum + power; 
            n = n / 10;



        }
       System.out.println(sum);
        
    }

        
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number N");
        int n = sc.nextInt();
        arm(n);
        // power(n);
        // perfect(n);



        // System.out.println("enter the number R");
        // int r = sc.nextInt();   ncr    



        // digitCount(n);   
        // decimal(n);
        // fi(n);   ficonaciseries
 
        // int nCr = fact(n) / fact(n-r);
        // System.out.println(nCr);             NcR

        

    //     int rev = 0 ;
    //     int sum = 0;
    //     System.out.println("enter the number");
    //     int n = sc.nextInt();
    //     int org = n;

    //     while(n>0){
    //         int ques = n%10;
    //         rev = (rev* 10 )+ques; 
    //         sum =sum + ques;
    //         n = n/10;


    //     }
    //     System.out.println(rev);
    //     if(org == rev){
    //         System.out.println("palindrome");
    //     }
    //     else{
    //         System.out.println("not palidrome");
    //     }
    //     System.out.println(sum);
    }
    
}
