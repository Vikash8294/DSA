import java.util.*;

public class h {

    // power////////////////////
    
    // public static int calpower(int x , int n){
    //     int power = 1;
    //     for(int i = 1 ; i <= n ; i ++){
    //         power = power*x;
    //     }
    //     return power ;
    // }  
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number");
    //     int x = sc.nextInt();
    //     System.out.println("enter the power");
    //     int n = sc.nextInt();
    //     int po = calpower(x , n);
    //     System.out.println(po);



    // *********************************factorial ******************

    //  public static int calfact(int n){
    // //     int fact = 1;
    // //     for(int i = n ; i> 0 ; i--){
    // //         fact = fact*i;
    // //     }
    // //     System.out.println("the factorial of "+ n + " is = "+ fact);
    // //     return 0 ;
    // // } 
    
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the number");
    //     int n = sc.nextInt();
    //     calfact(n);


      // *******************pefect number **********************
      public static int calperfect(int n ){
        int sum = 0;
        for (int i = 1 ; i < n ; i++){
            if(n % i == 0){
                sum = sum +i;
            }
        
        }
        if(sum == n ){
            System.out.println("perfect ");
        }
        else{
            System.out.println("not perfect");
        }
        return 0;
      }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        calperfect(n);
        
  

        // *******************************palindrome and armstong***********
       
        // int num = 0;
        // int rem ;
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int n = sc.nextInt();
        // int a = n;
        // int p = 3;

        // while(n>0){
        //     rem = n%10;
        //     int e = 1;
        // for (int i = 1 ; i<=p; i++){
        //     e = e*rem;
        // }
            
        //     num  = (num * 10 )+rem;
        //     sum = sum + e;
        //     n = n /10;

        // }
        // System.out.println("the reverse of number is " +num);
        // System.out.println("the sum is "+sum);
        // if (a == sum ){
        //     System.out.println(a +" is armstrong");
        // }
        // else{
        //     System.out.println(a +" is not armstrong");
        // }
        
        
        // if (a == num ){
        //     System.out.println(num +" is palindrom");
        // }
        // else{
        //     System.out.println(num +" is not palindrom");
        // }
        
    // ***************************************Birnary number ***************
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number");
    // int n = sc.nextInt();
    // int rem ;
    // int num = 0;
    // int power = 1;
    // while(n>0){
    //     rem = n%2;
    //     n = n/2;
    //     num = num + rem * power ;
    //     power = power*10;
        
    // }
    // System.out.println(num);


    // *****************************************Decimal number ***********************

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the number");
    // int n = sc.nextInt();
    // int rem ;
    // int num = 0;
    // int power = 1;
    // while(n>0){
    //     rem = n%10;
    //     n = n/10;
    //     num = num + rem * power ;
    //     power = power*2;
        
    // }
    // System.out.println(num);



    // *******************************swpping 
    // int a = 1;
    // int b = 2;
    // int t = a;
    // a = b ;
    // b = t ;
    // System.out.println( "A is " + a);
    // System.out.println( "B is " + b );

    // without using thrird number
    // int a = 1;
    // int b = 3;
    // a = a + b;
    // b = a- b ;
    // a  = a -b  ;
    // System.out.println( "A is " + a);
    // System.out.println( "B is " + b );


// prime numbetr ********************
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the number");
// int n = sc.nextInt();
// boolean isPrime = true;

// for(int i = 2 ; i<n ; i++){
//     if(n%i==0){

//         isPrime = false;
//         break;
//     }
// }

//     if (isPrime == true){
//         System.out.println("prime");
//     }
//     else{
//         System.out.println(" not prime");
//     }

//     }
// }
    

  
}}