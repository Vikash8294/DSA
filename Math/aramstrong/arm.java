public class arm {
    public static void As(int n ) {
        int q = n ;
        int cs =0;
        
        while(q !=0){
            // int power = 1;
            int d = q %10;
            // for(int i = 1 ; i<=3 ; i++){
            //     power = power *  d;
            // }
            cs = cs + (d*d*d);
            q= q/10;
        }
        System.out.println(cs);
        if(cs == n){
            System.out.println("armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
    }
    public static void main(String[] args) {
        int n = 153;
        As(n);
        
    }
}
