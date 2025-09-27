import java.util.*;
public class UpperCaseandLowercase {

    public static void main(String[] args) {
        char ch ; 
        char ch1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charcter");
        ch = sc. next(). charAt(0);
        if(ch>= 'A' &&  ch <= 'Z'){
            ch1 = Character.toLowerCase(ch); 
            System.out.println("LowerCase : "+ ch1);
        }
        else{
            ch1 = Character.toUpperCase(ch); 
            System.out.println("UpperCase : "+ ch1);
        }
        }
    }
    

