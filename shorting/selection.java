
import java.util.Arrays;

public class selection {
    public static void SS(int arr[]) {
        for(int i=0; i<=arr.length-1; i++){
            int si = i;// smallest index
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[si]){
                    si = j;
                
                }
                   
            }
            int temp = arr[i]; // swappimg is in outerrlopp remainber it 
            arr[i] = arr[si];
            arr[si] = temp;
        }
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);

        }
        
    }
    public static void ds(int num[]) {
        for(int i =0; i<num.length-1; i++){
            int li = i; 
            for(int j =i+1; j<num.length; j++){
                if(num[j] > num[li]){
                    li =j;
                
            }
        }
        int temp = num[li];
        num[li] = num[i];
        num[i] = temp;

        }
        for(int i =0; i<num.length;i++){
            System.out.print(num[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2,6};
        int num[]= {5,4,1,3,2,6};
        int sorts[]= {5,4,1,3,2,6,0,0,0,11,1,1};
        Arrays.sort(sorts);
        System.out.print(Arrays.toString(sorts));
        System.err.println(" ");
        SS(arr);
        ds(num);
    }
    
}
