// 344 leetcode

public class reverse {
    public static void r(char s[]) {
        int st = 0;
        int e = s.length-1;
        while(st < e) {
            char t = s[st];
            s[st] = s[e];
            s[e] =t;
            st++;
            e--;
        }
        for(int i =0; i<s.length; i++){
            System.out.print(s[i]);
        }        
    }
    public static void main(String[] args) {
        // char s [] = {"h","e","l","l","o"}; 
        char s[] = {'h','e','l','l','o'};
        r(s);
    }
}
