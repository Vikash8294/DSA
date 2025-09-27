public class power {
    public static void pow(int x, int n) {
        int bf = n;
        int ans = 1;
        while(bf!=0){
            if(bf%2 == 1){
                ans = ans * x;

            }
            x= x*x;
            
            bf= bf/2;
        }
        System.out.println(ans);


        
    }
    public static void main(String[] args) {
        int x= 3;
        int n = 5;
        pow(x, n);
        
    }
}
