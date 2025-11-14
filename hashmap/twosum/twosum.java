
import java.util.*;
public class twosum {
    public static int [] twosum(int num[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<num.length; i++){
        int needed = target - num[i];
        if(map.containsKey(needed)){
            return new int[] {map.get(needed), i};

        }
        map.put(num[i], i);

        }
        

        return new int [] {-1, -1};
    }
    public static void main(String[] args) {
        int num[] = {2,7,11,5};
        int target = 12;
        int ans [] = twosum(num, target);
        for(int i = 0 ; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
