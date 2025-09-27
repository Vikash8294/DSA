
// 
public class s {
    public static int singlelement(int num[]) {

        if(num.length == 1){
            return  num[0];

        }
        int s = 0;
        int e = num.length-1;
        
        while(s<e){
            int mid = s +(e-s)/2;
            if(mid ==0 && num[0] != num[1]){
                return  num[mid];

            }
            if(mid ==num.length-1 && num[num.length-1] != num[num.length-2]){
                return  num[mid];

            }
             if(num[mid] != num[mid-1] && num[mid] != num[mid+1]){
                return  num[mid];
            }
            if(mid%2==0){
            if (num[mid] == num[mid-1]) {
                e = mid -1;
            }else{
                s = mid+1;
            }
            
            }else{
                 if (num[mid] == num[mid-1]) {
                    s = mid +1;
            }
            else{
                e = mid-1;
            }
            }
            
        } 
        return -1;

        
    }
    public static void main(String[] args) {
        // int num[] ={1,1,2,3,3,4,4,8,8};
        int num[] ={1,1,3,3,7,10,10,11,11};
        int ans =singlelement(num);
        System.out.println(ans);
        

        
    }
    
}
