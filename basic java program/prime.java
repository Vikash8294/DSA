import java . util.*;
public class prime {
    public static void calPrime(int n ){
        int count = 0;
        
        for(int i =2; i<=n ; i++){
            boolean temp = true;
        for(int j = 2; j<i;j++){

            if(i%j==0){
                temp = false;
                
                // System.out.println(j+" is Not Prime");
                break;
            }
        }   
    
        if(temp == true){
            
            System.out.println(i+" is  Prime");
            count ++;
        
     }
     
            
    }
    System.out.println(count);

        
    return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        // System.out.println("Enter staring Number");
        // int i = sc.nextInt();
        calPrime(n);

}
}


