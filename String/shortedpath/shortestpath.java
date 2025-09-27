public class shortestpath {
    public static float sp(String path ) {
        int y =0;
        int x =0;

        for(int i =0; i<path.length(); i++){
            if(path.charAt(i) == 'S'){
                y--;
            }
            else if(path.charAt(i) == 'N'){
                y++;
            }
            else if(path.charAt(i) == 'E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        float x2 = x*x;
        float y2 = y*y;

    return  (float)Math.sqrt(x2 + y2) ;   
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float result = sp(path);
        System.out.println(result);

   
    }
    
}
