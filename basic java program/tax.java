import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        float sal = sc.nextInt();
        float tax ;
        if(sal <= 10000){
            tax = 0;
            System.out.println("NO TAX"+ tax );
            
        }
        else if(sal > 10000 && sal <=100000){
            tax = (sal/100)*10;
            System.out.println(tax);
            
        }   
        else if(sal > 100000 ){
            tax = (sal/100)*20;
            System.out.println(tax);
            
        } 
     }
}
