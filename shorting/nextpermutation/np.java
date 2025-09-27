// lexicographically  means the next in dictionary order

public class np {
    public static void nextper(int num []) {
        int n = num.length;
        int pivot = -1;
        for(int i = n-2; i>=0; i-- ){
            if(num[i] < num[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            int i = 0;
            int j = n-1;
            while(i<j){
                int t = num[i];
                num[i] = num[j];
                num[j] =t;
                i++;
                j--;
            
            }
        }else{
        for(int i = n-1; i>pivot; i--){
                if(num[i] > num[pivot]){
                int t = num[i];
                num[i] = num[pivot];
                num[pivot] =t;
                break;

                }
            }
        
        int i = pivot +1;
        int j = n-1;
        while(i<j){
            int t = num[i];
            num[i] = num[j];
            num[j] =t;
            i++;
            j--;
            }
        }

        

        for(int a=0; a<n; a++){
            System.out.print(num[a] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num1 [] ={1,2,3,6,5,4};
        int num2 [] ={5,4,3};
        
        nextper(num1);
        nextper(num2);
        
        
    }
}
