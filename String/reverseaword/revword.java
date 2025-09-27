// leetcode 151

public class revword {

    // reverse a string without the use of stringbuildser******************

    // *************Method1 *******************

    public static String rev(String s) {
        char rev[] = s.toCharArray();
        int i =0;
        int j = rev.length-1;
        while(i<j){
            char t = rev[i];
            rev[i] = rev[j];
            rev[j] = t;
            i++;
            j--;
        }

       
    return new String(rev);
    }
// *********************************METHOD2*****************************************
    public static void rev2(String s) {
         String ans = "";
        for(int i=s.length()-1; i>=0; i-- ){
            ans = ans + s.charAt(i);

        }
    System.out.println(ans);  
    }

    
    public static String rw(String s) {
        String rs = new StringBuilder(s).reverse().toString();
        String ans ="";
        for(int i =0; i<=rs.length()-1; i++){
            String word = "";
            while(i<rs.length() && rs.charAt(i) != ' '){
                word = word + rs.charAt(i);
                
                i++;

            }
            String rw = new StringBuilder(word).reverse().toString();
            ans = ans + " "+rw;
        }


    return ans.substring(1);
        
    }
    public static void main(String[] args) {
        String s  = "the sky is blue";
        String a = rw(s);
        System.out.println(a);
        String ans = rev(s);
        System.out.println(ans);
        rev2(s);


        

    }
    
}
