import java.util.*;
public class fre {
     public static void Freq(String s){
        int fr [] = new int[256];
        for(int i = 0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));
                if(ch >= 'a' && ch<= 'z' ){
                    fr[ch]++;
                }

            }

        
        for(int i =0; i<256; i++){
            if(fr[i] > 0){
                System.out.println((char )i + ": "+fr[i]);

            }
            
        }

            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Freq(s);
       
    }
}
