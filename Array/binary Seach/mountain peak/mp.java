

public class mp {
    public static void peak(int num[]) {
        int start = 1;
        int end =num.length-2;
        int ans =-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(num[mid]> num[mid -1] && num[mid]>num[mid+1]){
                ans = mid;
                
                
            }
            if(num[mid]>num[mid-1]){
                start = mid +1;

            }
            else{
                end = mid -1;
            }
    }
        System.out.println(ans);

        
    }
public static void main(String[] args) {
    int num []= {0,3,8,9,5,2};
    peak(num);
    
}    
}
