public class count {
    public static void DutchNationalFlagAlgorithm(int arr[]) {
        int high = arr.length-1;
        int low = 0;
        int mid =0;
        while (mid<=high){
            if(arr[mid] == 0){
                int t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                low++;
                mid++;

            }
            else if(arr[mid] == 1){
                mid++;

            }
            else if (arr[mid] == 2){
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;

            }
        }
    for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]);

}
        
    }
    public static void main(String[] args) {
        int arr [] = {2,0,2,1,1,0};
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == 0){
                c0 ++;
            }
            if(arr[i] == 1){
                c1 ++;
            }
            if(arr[i] == 2){
                c2 ++;
            }
        }
        int ind =0;
        for(int i = 0; i<c0; i++){
            arr[ind++] = 0;
        }
         for(int i = 0; i<c1; i++){
            arr[ind++] = 1;
        }
         for(int i = 0; i<c2; i++){
            arr[ind++] = 2;
        }

for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]);

}
System.out.println(" ");
    
DutchNationalFlagAlgorithm(arr);

}

    
    
}
