public class lowerbound {
     public static int getLowerBond(int num[], int key) {
        int start = 0; 
        int end = num.length-1;
        int res = num.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(num[mid] >= key){
                res = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return  res;
        
    }
    public static void main(String[] args) {
        int num[] = {3,5,8,15,19}; 
        int key = 20;
        System.out.println("the tarGet of lowerbound  is as index : "+ getLowerBond(num, key));
    }
    
}
