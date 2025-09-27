// window based apporach

public class ps {
    public static boolean isSamefre(int fre1[], int fre2[]){
        for(int i =0 ; i < 26 ; i++){
            if(fre1[i] != fre2[i]){
                return false;
            }
        }
    return true;

    }
    public static boolean isInString(String s1, String s2) {
        int freq []= new int[26];
        for(int i =0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a' ]++;

        } 
        int windsize = s1.length();
        for(int i =0; i<s2.length() ; i++){
            int ind = i; 
            int winind = 0;
            int winfre [] = new int[26];

            while(winind < windsize && ind < s2.length()){
                winfre[s2.charAt(ind) - 'a']++;
                ind++;
                winind++;

            }
            if(isSamefre(freq,winfre)){
                return true;
            }

        }

    return false;
        
    }
    public static void main(String[] args) {
        String s1 = "ab";
        // String s2 = "eidbaooo";
        String s2 = "eidboaoo";
        boolean res =isInString(s1, s2);
        System.out.println(res);
        
    }
}
