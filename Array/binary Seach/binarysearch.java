

public class binarysearch {
    public static int getBinarySearch(int num[], int key) {
        int start = 0; 
        int end = num.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(num[mid] == key){
                return mid;
            }
            if( num[mid] < key){
                start = mid +1;
            }
            else{
                start = mid-1;
            }
        }
        return  -1;
        

        
        
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18,20 };
        int key = 20;
        System.out.println("the index is: " + getBinarySearch(num, key));
        
    }
    
}
