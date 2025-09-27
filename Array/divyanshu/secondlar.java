package divyanshu;
public class secondlar {
    public static void main(String[] args) {
        int num [] = {10,20,3,40};
        int max = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            if(max < num[i]){
                max = num[i];
            }      
        }
        for(int i=0; i<num.length;i++){
            if(num[i] != max){
                if (num[i] > sl) {
                    sl = num[i];
                }
            }      
        }
        System.out.println(sl);
        

    
    }
    
}
