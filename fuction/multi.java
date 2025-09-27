import java.util.Scanner;
public class multi{
    public static int getMulti(int a, int b){
        int multi =a*b;
        return multi;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number ");
    int a = sc.nextInt();
    System.out.println("Enter Second number ");
    int b = sc.nextInt();

   int multi = getMulti(a, b);
   System.out.println("Multiply of "+a+" and "+b+" is : " +multi);
}
    
}
