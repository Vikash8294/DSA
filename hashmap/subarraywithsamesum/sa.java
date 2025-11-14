import java.util.*;
public class sa{
    public static void s(int []arr) {
        int c = 0;
        Set<String>seen = new HashSet<>();
        for(int i =0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if((arr[i] + arr[j] )% 2 ==0){
                    String pairkey  = arr[i]+","+arr[j];
                    if(!seen.contains(pairkey)){
                        seen.add(pairkey);
                        System.out.println(pairkey);
                        c++;

                }
                }
                
            
        }

        }
        System.out.println(c);
        
    }
    public static void main(String [] args){
        int[] arr = {1,2,3,2,6,5,4};
        s(arr);


    }
}