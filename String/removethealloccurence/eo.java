// leetcode no. 1910
public class eo {
    public static void ro( String s,String part) {
        while(s.contains(part)){
            s = s.replaceFirst(part, "");

            // or ********
            // int index = s.indexOf(part);
            // s = s.substring(0,index) + s.substring(index + part.length());
        }
        System.out.println(s);
        System.out.println(s.length());
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String path = "abc";
        ro(s, path);
    }
    
}
