import  java.util.*;
public class pair {
    public static void Arraypair(int num[]) {
        int pairsum = 0;
         for(int i =0 ; i<num.length; i++){
            for(int j = i+1; j< num.length; j++){
                System.out.print("("+num[i]+ ","+num[j] + ") ");
                pairsum = pairsum + 1;
            }
            System.out.println(" ");
          }

          System.out.println("the total sum of pair is : "+pairsum);



        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = {2,4,6,8,10};
        Arraypair(num);
    }

    
}
