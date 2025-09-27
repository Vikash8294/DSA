////Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import  java.util.Scanner;
public class findNum {

    public static void findCAlNum(){
        int positive = 0;
        int negative =0;
        int zero =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1/0 to continue or break");
        int input = sc.nextInt();
      while(input == 1){
        System.out.println("enter the number");
        int j = sc.nextInt();
        if(j>0){
            positive = positive+1;
        }
        else if (j<0){
            negative = negative+1;
        }
        else if (j==0){
            zero = zero+1;
        }
        System.out.println("enter 1/0 to continue or break");
        input = sc.nextInt();
    }
        System.out.println("posi"+positive);
        System.out.println("negi"+negative);
        System.out.println("zero"+zero);
        return;
    }
        
    
    public static void main(String[] args) {
        findCAlNum();
        
       
    
        
    }
}
