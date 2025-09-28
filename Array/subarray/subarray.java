public class subarray {
    public static void  SA(int num[]) {
        int ts = 0;
        int maxsum = 0;
        
        

        for(int i =0; i<num.length;i++ ){
            for(int j =i; j<num.length; j++){
                int sum = 0;
                
                
                for(int k =i ; k<=j; k++){

                    System.out.print(num[k]);
                    sum = sum +num[k];
                }
                System.out.println(" ");
                System.out.println("sum"+ sum);
                ts = ts +1;   
                maxsum = Math.max(maxsum,sum); 

            }
            System.out.println(" ");
            
            
        }

        System.out.println("total number of subarray  is: "+ts);
        System.out.println("maxsum is :" + maxsum) ;
        
        
    }
    public static void main(String[] args) {
        
        int num[] = {1,-2,6,-1,3};
        // int num[] = {2,4,6,8,10};
        SA(num);

    }
    
}
