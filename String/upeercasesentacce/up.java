public class up {
    public static String upperca(String s) {
        String ans ="";
        char ch = Character.toUpperCase(s.charAt(0));
        ans = ans+ch;
        
        for(int i=1 ; i<s.length() ; i++){
           if(s.charAt(i) == ' ' && i< s.length()-1){

                ans = ans + s.charAt(i);
                i++;
                ans = ans + Character.toUpperCase(s.charAt(i));
                
            }
            else{
                ans = ans + s.charAt(i);

            }
        }
    return ans;  
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
       String a =upperca(s);
       System.out.println(a);
    }
    
}
