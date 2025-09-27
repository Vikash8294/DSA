import java.util.Arrays;
public class me {
    public static int majorityelement(int nums[]) {
        int count=0;
        int mj =0;
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > nums.length/2){
                    mj = nums[i];
                }
                

            }
            

        }

    return mj;
    }

    public static int optimal(int nums[]) {
        
        int count=1;
        int mj =nums[0];
        Arrays.sort(nums);


        for(int i =1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                    count++;
                }
            else{
                count = 1; 
            }
            if(count > nums.length/2){
                mj = nums[i];

            }
            
            

        }

    return mj;
    }
    public static int moore(int nums[]) {
        
        int count=0;
        int mj =0;


        for(int i =0; i<nums.length; i++){
            if(count == 0){
                    mj = nums[i];
                }
            if(nums[i] == mj){
                count = count+1; 
            }
            else{
                count --;

            }
            
            

        }

    return mj;
    }
    public static void main(String[] args) {
        int nums []= {1,2,2,1,1,2,2};
        // int aws = majorityelement(nums);
        // int aws = optimal(nums);
        int aws = moore(nums);
        System.out.println(aws);
        
    }
    
}
