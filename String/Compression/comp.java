public class comp {
    public static String sc(String s) {
        Integer count = 1;
        String ans = "";
        for(int i =0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1) ){
                count ++;

            }
            else{
                if(count > 1){
                ans = ans + s.charAt(i) + count;
                count =1;

                }
                else{
                    ans = ans + s.charAt(i);
                }
                
            }
            
        }
        if(count > 1){
            ans = ans + s.charAt(s.length()-1) + count;

        }else{
            ans = ans + s.charAt(s.length()-1);
        }
        
        


    return ans ;    
    }

    public static String sc2(String s) {
        StringBuilder sb = new StringBuilder("");
        Integer c = 1;
        for(int i =0; i<s.length(); i++){
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                c++;
                i++;
                
            }
            sb.append(s.charAt(i));
            if(c>1){
                sb.append(c);
                c=1;
            }
        }
    return sb.toString();    
    }

    public static char[] sc3(char ch []) {
        StringBuilder m = new StringBuilder("");
        int c = 1;
        for(int i =0; i<ch.length; i++){
            while(i<ch.length-1 && ch[i] == ch[i+1]){
                c++;
                i++;
                
            }
            m.append(ch[i]);
            if(c>1){
                m.append(c);
                c=1;
            }
        }
    return m.toString().toCharArray();   
    }
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        // String s = "abc";
        String a = sc(s);
        System.out.println(a);
        String b = sc2(s);
        System.out.println(b);
        char ch[] = {'a', 'a','a','b','b','c','c','d'};
        char[] w = sc3(ch);
        System.out.println(w);

        
    }
    
}
