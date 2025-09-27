public class gcd {
    public static int gcd0(int x, int y) {
        if(y==0){
            return x;
        } 
        return gcd0(y, x%y);
        
    }
    public static void gcd1(int a[] , int b[], int n , int m) {
        int p1 = 1;
        for (int i = 0; i < n; i++) {
            p1 = p1 * a[i];
            
        }
        int p2 = 1;
        for (int i = 0; i < m; i++) {
            p2 = p2 * b[i];
            
        }
        int finalhcf = gcd0(p1, p2);
        System.out.println(finalhcf);
        
        
    }
    public static void lcm(int p1, int p2) {
        System.out.println("LCM is : "+p1 *p2 / gcd0(p1, p2)); 
        
    }
    public static void main(String[] args) {
        int a[] ={12,24,36};
        
        int b[] = {18,54};
        gcd1(a, b, a.length,b.length);
        int p1 = 1;
        for (int i = 0; i < a.length; i++) {
            p1 = p1 * a[i];
            
        }
        int p2 = 1;
        for (int i = 0; i < b.length; i++) {
            p2 = p2 * b[i];
            
        }
        lcm(p1, p2);
        
    }
    
}
