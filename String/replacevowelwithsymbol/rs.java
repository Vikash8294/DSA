
public class rs {
    public static void replaceString(String s) {
        String str = s;
       
        str= str.replaceAll("[AaEeIiOoUu]", "*");
        //  str = str.replaceFirst("vikash", "");
        


        //*************************************** */ or******************************************


   
        
        StringBuilder bs = new StringBuilder("");
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ('a') || s.charAt(i) == ('e')|| s.charAt(i) == ('i')||s.charAt(i) == ('o')||s.charAt(i) == ('u') ||s.charAt(i) == ('A')||s.charAt(i) == ('E')||s.charAt(i) == ('I')||s.charAt(i) == ('O')||s.charAt(i) == ('U')){
                bs.append("*");
            }
            else{
                bs.append(s.charAt(i));

            }
           
        }

        System.out.println(bs);
        System.out.println(str);
    }
    public static void main(String[] args) {
        // String s = "Welcome IncludeHelp!";
        String s = "vikash Sakshi elephant vikash Sakshi";
        replaceString(s);
        
    }
    
}
