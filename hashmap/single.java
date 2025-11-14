import java.util.*;
public class single{
    public static void frq(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i] )+ 1) ;
            }else{
                map.put(arr[i] , 1);
            }
        }
        System.out.println("Unique elements:");
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }

        }
        

    }
   public static void set(int []arr) {
    Set<Integer>seen = new HashSet<>();
    Set <Integer> unqiue = new HashSet<>();
    for(int i = 0 ; i<arr.length; i++){
        int num = arr[i];
        if(!seen.contains(num)){
            seen.add(num);
            unqiue.add(num);
        }else{
            unqiue.remove(num);
        }

    }
    System.out.println("Single Element :" );
    for(int num : unqiue){
        System.out.println(num);
    }

       
   }
    public static void main(String[] args){

        int[] arr = {1, 2, 4, 4, 2, 1, 6, 5, 2, 5};
        frq(arr);
        set(arr);

    }
}