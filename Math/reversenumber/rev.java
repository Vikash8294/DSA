public class rev {
    public static void main(String[] args) {
        int x = 4537;
        int rev = 0;
        while(x!= 0){
            int d = x%10;
            rev = rev *10 + d;
            x = x/10;
            
        }
        System.out.println(rev);
    }
    
}
