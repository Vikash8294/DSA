import java.util.*;
public class first{
    public static void getName(String name){
        System.out.println("your name is "+name);
        return;
    }

    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        getName(name);

        
    }
}