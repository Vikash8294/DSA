public class insertion {
    public static void ins(int var1[]) {
        for(int i=0; i<var1.length-1; i++){
            for(int j = 1; j<var1.length;j++){
                int p = j-1;
                int curr = var1[j];
                while(p>=0 && var1[p]>curr ){
                    var1[p+1] = var1[p];
                    p--;

                }
                var1[p+1]= curr;


            }

        }
        for(int i =0; i<var1.length;i++){
            System.out.println(var1[i]);
        }
        
    }
        public static void di(int num[]) {
        for(int i =0; i<num.length; i++){
            for(int j =1; j<num.length; j++){
                int curr = num[j];
                int p = j-1;
                while(p>=0 && num[p] < curr){
                    num[p+1]= num[p];
                    p--;
                }
                num[p+1] = curr;
             
        }

        }
        for(int i =0; i<num.length;i++){
            System.out.print(num[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 3, 4, 5};
        ins(var1);
        int num []= {1, 2, 3, 4, 5};
        di(num);

    }
    
}
