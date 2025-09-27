import java.util.Scanner;
public class sum {
    public static void getSum(int a, int b){
        if(a>b){
            System.out.println( a+"  is gretaer than B");
        }
        else{
            System.out.println(b +" is Greater ");
        }
        System.out.println("sum of "+a+"and"+b+"is:"+(a+b));
        return;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number ");
    int a = sc.nextInt();
    System.out.println("Enter Second number ");
    int b = sc.nextInt();

    getSum(a, b);
}
    
}
