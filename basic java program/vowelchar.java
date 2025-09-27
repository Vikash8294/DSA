import java. util.*;
public  class vowelchar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thee character");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch =='e' || ch == 'i'|| ch  == 'o' || ch == 'u'){
            System.out.println("Vowel");

        }
        else{
            System.out.println("Constant");

        }
    }
    

}