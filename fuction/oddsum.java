import java.util.Scanner;

public class oddsum {
    
    public static void getOddSum(int n ){
        int sum = 0;
        for(int i = 0; i<= n; i++){
        if(i%2!= 0){
            sum = sum + i;
        }}
        System.out.println("the sum of odd number between "+ n+" is :"+ sum);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        getOddSum(n);
        
        
    }
    
}
