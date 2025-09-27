public class floorandceil {
    public static int floor(int num[], int target) {
        int start = 0;
        int end = num.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start +end)/2;
            if(num[mid] <= target){
                ans = num[mid];
                start = mid+1;
                
            }
            else {
                end = mid-1;
                
            }
            
        }
        return ans;

        
    }

    public static int ceil(int num[], int target) {
        int start = 0;
        int end = num.length-1;
        int ans = -1;
        while(start <= end){
            int mid = (start +end)/2;
            if(num[mid] >= target){
                ans = num[mid];
                end = mid-1;
                
            }
            else {
                start = mid+1;
                
            }
            
        }
        return ans;

        
    }
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50}; 
        int target = 90;
        System.out.println("floor: "+ floor( num, target));

        System.out.println("Ceil: "+ ceil(num, target));
    }
    
}
