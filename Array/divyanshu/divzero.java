package divyanshu;
public class divzero {
    public static void shor(int num[]) {
        int end = num.length-1;
        int start = 0;

        while(start <= end){
            if(num[start] == 0 && num[end] != 0){
                int temp =num[end];
                num[end] = num[start];
                num[start] = temp;
            
                end = end -1;
                start = start +1;

            }
            else if (num[end] == 0 && num[start ]==0 ) {
                end = end -1;
            }
            else{
                start = start +1;
            }
            // else if(num [start] != 0 && num[end] == 0  ){
            //     start = start +1;
            //     end = end -1;

            // }
            // else if (num[start] !=0 && num[end] != 0){
            //     start = start +1;
            // }
        }
    
    }
    public static void main(String[] args) {
        int num [] = {10,0,20,0,30,0,0};
        shor(num);
        for (int i = 0; i < num.length; i++) {
        System.out.print(num[i]+ ", ");
        
    }
      
        
    
    }
    
}
