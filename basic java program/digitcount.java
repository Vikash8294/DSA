import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc. nextInt();
        int count = 0;
        while(a>0){
            a= a/10;
            count = count+1;

        }
        System.out.println("the number of digit in number are " +count);
        
    }
    
    
    
}
