public class book {
    public static boolean isvalid(int arr[], int n ,int m , int maxpage){
        int page = 0;
        int st = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>maxpage){
                return  false;
            }
            if(page+ arr[i] <= maxpage){
                page = page+ arr[i];
            }
            else{
                st ++;
                page = arr[i];
            }

            
        }
    return st > m ? false : true;
    } 


    public static int bkall(int arr[], int n ,int m) {
        int sum = 0;
        for(int i =0; i<n; i++){
            sum = sum + arr[i];
        }
        int s = 0;
        int e = sum;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(m > n){
                return -1;
            }
            
            if (isvalid(arr, n , m , mid)){
                ans = mid;
                e = mid -1;

            }
            else{
                s = mid +1;
            }
        }
    return ans;   
    }
    public static void main(String[] args) {
        int arr[] ={10,10,10,10};
        int n =4;
        int m = 2;
        int a = bkall(arr, n, m);
        System.out.println(a);
        
    }
    
}
