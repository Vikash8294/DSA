import java.util.Scanner; // gretest commomn Factor


public class GCF {
    public static int  gcd(int x , int y ) {
        if(y==0) return x;
        return gcd(y, x%y);
        
    }
    public static void calGCF(int a[], int b[] , int n , int m){
        // if(a == 0){
        //     System.out.println(b);
        // }
        // else if(b==0){
        //     System.out.println(a);
        // }
        // else if (a>b) {
        //     System.err.println(a-b);
            
        // }
        // else if (b>a) {
        //     System.err.println(b-a);
            
        // }
        // if(a==b){
        //     System.out.println(a);
        // }
        
        int hcfa =a[0];
        for(int i = 1 ; i < n; i++){
            hcfa = gcd(hcfa, a[i]);

            

        }

         int hcfb =b[0];
        for(int i = 1 ; i < m; i++){
            hcfb = gcd(hcfb, b[i]);

            

        }

        int finalgcd = gcd(hcfa, hcfb);
        System.out.println("the hcf of both array is "+finalgcd);


        
        // min = Math.min(a, b);
        // int hcf =0 ;

       
        // System.out.println(hcf);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first nummber");
        // int a = sc. nextInt();
        // System.out.println("enter the second number");
        // int b = sc. nextInt();
        
        int a[] ={12,24,36};
        
        int b[] = {18,54};
        
        // System.out.println("The HCF of  "+a+" and "+b+" is :");
        calGCF(a, b, a.length,b.length);
        
        
        
    }
    
}