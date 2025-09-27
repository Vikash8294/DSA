class ro{
    public static void rotaedOrderedArray(int nums[],int target) {
        int start = 0;
        int end = nums.length-1;
        int ans =-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                ans = mid;
                
            }
            //left shorted
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid -1;
            }
            else{
                start= mid+1;
            }

            }
            //right
            else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid +1;
            }
            else{
                end= mid-1;
            }

            }
            
            
        }
        System.out.println(ans);

        
    }
    public static void main(String[] args) {
        int nums[] ={3,4,5,6,7,0,1,2};
        int target = 0;
        rotaedOrderedArray(nums, target);
    }

}
