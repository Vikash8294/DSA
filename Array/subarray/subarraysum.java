public class subarraysum {
    public static void sub(int num[]) {
        int max = Integer.MIN_VALUE;
        int ts = 0;
        for(int i =0; i<num.length; i++){
            for(int j = i; j<num.length;j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    System.out.print(num[k]);
                    sum= sum+num[k];
                    
                    
                }
                ts = ts+1;
                System.out.println(" ");
                // System.out.println("sum :"+sum);
                

                if(sum>max){
                    max = sum;
                }

                
            }
            System.out.println(" ");
        }
        System.out.println("largest NUmber is : "+ max);
        System.out.println("total subarray is :"+ ts);
        
    }
    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        sub(num);
    }
    
}
