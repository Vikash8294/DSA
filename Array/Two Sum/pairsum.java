import java.util.Arrays;
public class pairsum {
    public static void  twosum(int nums[], int target)  {
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i +","  +j);
                }

            }

        }  
    }
//    only for sorted array

    public static int [] optimaltwosum(int nums[], int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            int pairsum = nums[start] + nums[end];
            if(pairsum == target){
                return new int [] {start, end};
            }
            if (pairsum < target){
                start = start+1;
            }
           
            else{
                end = end -1;
            }

        }
        return new int[]{};
    }
    public static void main(String[] args) {
       int nums []= {2,7,11,15};
       int  target = 9;
       int result[] = optimaltwosum(nums, target);
       System.out.println(Arrays.toString(result));

    }
    
}
