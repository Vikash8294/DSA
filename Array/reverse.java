public class reverse {
    public static void getReverse(int num[]) 
    {int start = 0, end = num.length -1;
        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            

            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        int num []= {1,5,29,5,20};
    
        getReverse(num);
        for(int i =0; i<num.length;i++){
            System.out.println(num[i]);
        
    }

    }
    
    
}
