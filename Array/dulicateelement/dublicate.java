import java.util.Arrays;
public class dublicate {
    //  o(n^2) timecomplexcity
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length -1; i++){
                if(nums[i] == nums[i+1]){
                    return true;
                
            }
         
        }
        return false;
      
    }
    //  o(n) complexity
        public static boolean containsDuplicate1(int[] nums) {
        for(int i = 0 ; i <nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
         
        }
        return false;
      
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4};
        boolean ans = containsDuplicate1(nums);
        System.out.println(ans);
    }
}
    

