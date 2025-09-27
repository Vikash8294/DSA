public class painter {
    public static boolean isValid(int arr[], int n , int m , int maxtime) {
        int time = 0;
        int p = 1;
        for(int i =0 ; i <n; i++){
            if(arr[i] > maxtime){
            return false;
        }
        if(time+arr[i] <= maxtime){
            time = time + arr[i];
        }else{
            p = p+1;
            time = arr[i];
        }  
      }
        
    return p > m ? false: true;    
    }
    public static int pp(int arr[],int n,int m) {
        int sum = 0;
        int maxvalue = Integer.MIN_VALUE;
        for(int i =0 ; i<n; i++){
            sum =+sum + arr[i];
            maxvalue = Math.max(maxvalue, arr[i]);


        }
        int s = maxvalue;
        int e = sum ;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(m>n){
                return -1;
            }
            if(isValid(arr,n,m,mid)){
                ans = mid;
                e = mid -1;
            }else{
                s = mid+1;
            }
        }
    return  ans;   
    }
public static void main(String[] args) {
    int arr []= {40,30,10,20};
    int n = 4; 
    int m = 2;
    int a = pp(arr, n, m);
    System.out.println(a);

    
    
}
}
