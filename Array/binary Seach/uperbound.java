
public class uperbound {
    public static int upeerbound(int num[], int key) {
        int start = 0;
        int end = num.length-1;
        int aws = num.length;
        while(start <= end){
            
            int mid = (start+end)/2;

            if(num[mid]> key){
                aws = mid;
                end = mid -1;
                
            }
            else{
                start = mid +1;
            }


        }
        return aws;
        
    }
    public static void main(String[] args) {
        int num[] = {2,3,6,7,8,8,11,11,11,12};
        int key = 10;
        System.out.println("the index of key is : "+ upeerbound(num, key));
    }
    
}
