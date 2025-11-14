import java.util.*;
public class Main{
    public static boolean palindrome(String st ,int  i , int j){
        int s = i;
        int e = j;
        while(s<e){
            if(st.charAt(s) != st.charAt(e)){
                return false;
                
            }
            e--;
            s++;
        }
        return true;
        
    }
    public static void FS(String s){
        String longest = "";
        for(int i =0 ; i<s.length(); i++){
            for(int j =i; j<s.length(); j++){
                if(palindrome(s, i, j)){
                    String sub = s.substring(i , j+1);
                    if(sub.length() > longest.length()){
                        longest = sub;

                    }
                    

                }

            }

        }
        System.out.println(longest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "zbabas";
        FS(s);

        

    }
}