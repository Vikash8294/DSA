import java.util.Arrays;
public class Ac {
    public static boolean isValid(int arr[], int n , int m , int mindis) {
        
        int lastPosition = arr[0];
        int cow = 1;
        for(int i =1 ; i <n; i++){
            if(arr[i] - lastPosition >= mindis){
            lastPosition = arr[i];
            cow = cow+1;
        }
        if(cow ==m){
            return  true;
        }

      }

    return false;  
    }
    public static int pp(int arr[],int n,int m) {
        // int sum = 0;

        Arrays.sort(arr); // sort the array


        // int minvalue = Integer.MAX_VALUE;
        // int maxvalue = Integer.MIN_VALUE;
        // for(int i =0 ; i<n; i++){
        //     maxvalue = Math.max(maxvalue, arr[i]);
        //     minvalue = Math.min(minvalue, arr[i]);


        // }
        int s = arr[0];
        int e = arr[n-1] - arr[0];  // max value - min value
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(m>n){
                return -1;
            }
            if(isValid(arr,n,m,mid)){
                ans = mid;
                s= mid +1;
            }else{
                e = mid-1;
            }
        }
    return  ans;   
    }
public static void main(String[] args) {
    // int arr []= {40,30,10,20};
    int arr []= {1,2,8,4,9};
    int n = 5; 
    int m = 3;
    int a = pp(arr, n, m);
    System.out.println(a);

    
    
}
    
}
