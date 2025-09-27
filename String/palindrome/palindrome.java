// 

public class palindrome {
    public static boolean  isAlphaNumeric(char ch) {

        if(ch >= '0' && ch <='9' ){
            return true;
        }
        else if(Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch)<= 'z'){
            return true;
        }

        return false;
    }
    public static boolean pal(String s) {
        int st =0;
        int e = s.length()-1;
        while(st < e){
            if(!isAlphaNumeric(s.charAt(st))){
                st++;
                continue;

            }
            if(!isAlphaNumeric(s.charAt(e))){
                e--;
                continue;

            }

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(e)) ){
                return  false;
            }
            
            st++;
            e--;

        }
    return true;  
    }
    public static void main(String[] args) {
        String s = "Ac3?e3c&a"; // ignore the specail symbol consider only aplhanumeric
        boolean rest =pal(s);
        System.out.println(rest);

    

        
    }
    
}
