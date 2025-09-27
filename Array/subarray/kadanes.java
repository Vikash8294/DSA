public class kadanes {
    public static void kadane(int num[]) {
        int maxsum = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0; i<num.length; i++){
            // cs = cs +num[i]; 

            // for negative retun zero 
            // if(cs < 0 ){
            //     cs = 0;
            // }
            // for negative retun the lagest num itself 
            cs = Math.max(cs+num[i], num[i]);
            maxsum = Math.max(maxsum,cs);
        }
        System.out.println(" the max sum of subarray is : "+ maxsum);

    }
    public static void main(String[] args) {
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int num[] = {-2,-3,-4,-1,-5};
        kadane(num);
    }
    
}
