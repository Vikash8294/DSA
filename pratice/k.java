public class k {
    public static void kadane(int num[]) {
        int cs =0;
        int ms =Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            cs = Math.max(cs, num[i]);
            ms = Math.max(ms,cs);

            
        }
        System.out.println(ms);
        
    }
    public static void main(String[] args) {
        // int arr[] = {};
        int num[] = {-2,-3,-4,-1,-5,0};
        kadane(num);
        
    }
    
}
