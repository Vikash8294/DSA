public class lowerbond {
    public static int getLowerBond(int num[], int key) {
        for(int i = 0; i< num.length; i++){
            if(num[i] >= key){
                return i;
            }
        
        }
        return  num.length;
        
    }
    public static void main(String[] args) {
        int num[] = {3,5,8,15,19,19,19}; 
        int key = 22;
        System.out.println("the tarGet of lowerbound  is as index : "+ getLowerBond(num, key));
    }
    
}
