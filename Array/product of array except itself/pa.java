
public class pa {
    public static void poductofarray(int nums[]) {
        
        
        for(int i =0; i<nums.length;i++){
            int ans =1;
            
            for(int j = 0; j<nums.length; j++){
                if(i!=j){
                    ans = ans*nums[j];
                }   
            }
            System.out.println(ans);
            System.out.println(" ");

        }
        
    }
     public static void optimal(int nums[]) {
        int prifix []= new int[nums.length];
        prifix[0] = nums[0];


    for(int i =1; i<prifix.length;i++){
            prifix[i] = prifix[i-1] * nums[i-1];
            

        }
    // for (int i = 0; i < prifix.length; i++) {
    //     System.out.println(prifix[i]);

        
    // }

    int postfix []= new int[nums.length];
    postfix[nums.length-1] = 1;
    for(int i =nums.length-2; i>=0;i--){
        postfix[i] = postfix[i+1] * nums[i+1];
    }
    int p[]= new int[nums.length];
    for (int i =0 ; i<nums.length; i++){
        p[i] = prifix[i] *postfix[i];
        System.out.println(p[i]);

    }
                   
        
    }

    public static void moptimal(int nums[]) {
        int ans []= new int[nums.length];
        // int prifix = 1;
        ans[0] = nums[0];


    for(int i =1; i<nums.length;i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
    // for (int i = 0; i < prifix.length; i++) {
    //     System.out.println(prifix[i]);

        
    // }
    int postfix  = 1;
    for(int i =nums.length-2; i>=0;i--){
        postfix = postfix * nums[i+1];
        ans[i] = ans[i]*postfix;
    }
    for (int i = 0; i < nums.length; i++) {
        System.out.println(ans[i]);

        
    }
        
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        // poductofarray(nums);
        optimal(nums);
        moptimal(nums);
        
    }
    
}
