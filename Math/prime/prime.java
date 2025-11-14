import java.util.Arrays;

// Sieve of Eratosthenes

public class prime {
    public static void p(int n ) {
        int c =0;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i =2; i*i < n; i++){
            if(isPrime[i]){
                for(int j = i*i ; j<n ; j=j+i ){
                    isPrime[j] = false;
                    if(isPrime[i] == true){
                        c=c+1;

                }
        

            }
        
    }

        
        }

        for(int i =0; i<n ; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        } 
    System.out.println(" ");
        System.out.println(c);

        
    }

    public static void normalprime(int n) {
        int c =0;
        
        for(int i=2 ; i<=n ; i++){
            boolean isPrime = true;
            for(int j = 2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime == true){
            System.out.print(i + " "); 
            c++;
        }
        
        }
        System.out.println(" ");
        System.out.println(c);
        
    }
    public static void main(String[] args) {
        int n = 10;
        int c = 3246;
        System.out.println((int)(Math.log10 (c) +1) );
        // p(n);
        normalprime(n);
    }
    
}
