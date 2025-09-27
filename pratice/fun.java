
import java.util.Scanner;

public class fun {


    //odd summ****************************
    public static int OddSum(int n) {
        int sum = 0;
        for(int i =1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
            }

        }
        return  sum;
        
    }

        //gretest of two number
    public static void  GreatNum(int a, int b) {
        if(a>b){
            System.out.println("the greatest number is "+a);
        }
        else{
            System.out.println("the greatest number is "+b);
        }

        
    }

    // infinteloop

    public static void Loop(boolean i) {
        while(i = true){
            System.out.print(" hiii ");

        }
        
    }

    // take input till useer wants
    public static void CountNum() {
        Scanner sc = new Scanner(System.in);
        
        int pocount = 0;
        int negcount =0;
        int zero = 0;
        System.out.println("Enter 1/0");

        int input = sc.nextInt();
        while(input == 1){
            System.out.println("enter the num");
            int j = sc.nextInt();
        if(j>0){
            pocount = pocount+1;
            

        }
        if(j<0){
            negcount=negcount+1;
            
        }
        if(j==0){
            zero = zero+1;
            
        }

    System.out.println("Enter 1/0");

    input = sc.nextInt();
        
    }
    System.out.println("postive"+pocount);
    System.out.println("negative "+ negcount);
    System.out.println("zero "+ zero);
    

        
    }
// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

    public static int Calpower(int x , int n) {
        int power = 1;
        for(int i = 1 ; i<=n; i++){
            power = power * x;

        }
        return power;

        
    }

    // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)


    public static void HCF(int a , int b){
        while(a!=b){
            if(a==0){
                System.out.println(b);
                break;
            }
            else if(b==0){
                System.out.println(a);
                break;
            }
            else if(a>b){
                a = a-b;
            }
            else if(b>a){
                b= b-a;
            }
        }
        if(a==b){
                System.out.println(a);
        }
        
        


    }

    public static void fibbo(int n) {
        int f = 1;
        int s = 1;
        int t ;
        System.out.println(f);
        System.out.println(s);
        for(int i =3; i<=n;i++){
            t = f+s;
            System.out.println(t);
            f = s;
            s=t;


        }
        
    }
    public static void prime(int n) {
        boolean prime = true ;
        for(int i =2 ; i<n; i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        System.out.println(prime);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        prime(n);

// fibo
        // fibbo(10);

        //  hcf
        // HCF(18, 18);


        // power
        // int ans = Calpower(4, 2);
        // System.out.println(ans);



    





        // CountNum();

       // greatest of two number

        //  int a = sc.nextInt();
        //  int b = sc.nextInt();
        //  GreatNum(a, b);


        //infinte

        // boolean i = true;
        // Loop(i);




          //odd sum
        // int n = sc.nextInt();
        // int odd = OddSum(n);
        // System.out.println("the fact is "+ odd);
        







        
    }
}
