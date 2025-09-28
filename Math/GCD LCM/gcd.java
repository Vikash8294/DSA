

public class gcd {
    //normal way 
    public static int gcd1(int x, int y) {
        while(x>0 && y>0){
            if(x>y){
                x = x%y;
            }else{
                y =  y%x;
            }
        }
    if (x==0){
        return y;
    }
    return x ;
    }

    // **************************** recursion ***************
    public static int calGCD(int x, int y) {
        if(y==0){
            return x;
        }

    return calGCD(y, x%y)  ;
    }

    public static int lcm(int x, int y) {
        int lcm = (x*y)/ calGCD(x, y);
    return lcm;    
    }
    public static void main(String[] args) {
        int x =20;
        int y = 28;
        int a = calGCD(x, y);
        System.out.println(a);
        int b = gcd1(x, y);
        System.out.println(b);
        int c = lcm(x, y);
        System.out.println(c);
    }
    
}
