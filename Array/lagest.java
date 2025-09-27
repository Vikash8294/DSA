
public class lagest {
    public static int getLargestNumber(int num[]) {
        int Largest = Integer.MIN_VALUE; // - infinity
        for(int i = 0; i< num.length; i++){
            if(Largest < num[i]){
            Largest = num[i];
        }
        
        }
        int Smallest = Integer.MAX_VALUE; // + infinity
        for(int i = 0; i< num.length; i++){
            if(Smallest > num[i]){
            Smallest = num[i];
        }
        
        
        }
        System.out.println("The Smalllest Number in the array is: " +Smallest);
        


    return  Largest;   
    }
    public static void main(String[] args) {
        int num [] = {1,200,3,4,10,45 , 0 , -5,300,14,5,8,9};
        int ans = getLargestNumber(num);
        System.out.println("The Largest Number in the array is: " +ans);
    }
    
}
