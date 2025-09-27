public class brutforce {
    public static int watercontainer(int height[]) {
        int area = 0;
        int wt = 0;
        int ht =0;
        int maxwater = 0;
        for(int i =0; i<height.length;i++){
            for(int j =i+1; j<height.length; j++){
                wt = j-i;
                ht = Math.min(height[i],height[j]);
                
                area = wt*ht;
                maxwater = Math.max(maxwater,area);


            }
        }
    


    return maxwater;   
    }

    public static void optimal(int height[]) {
        int area = 0;
        int mw = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp){
            int w = rp - lp;
            int ht = Math.min(height[lp], height[rp]);
            area = w*ht;
            mw = Math.max(mw, area);
            if(height[lp] > height[rp]){
            // int w = rp - lp;
            // int ht = Math.min(height[lp], height[rp]);           *********correct*********
            // area = w*ht;
            // mw = Math.max(mw, area);
            rp --;

            }
            else{
            // int w = rp - lp;
            // int ht = Math.min(height[lp], height[rp]);      *********correct*********
            // area = w*ht;
            // mw = Math.max(mw, area);
            lp ++;
            }
        }
        System.out.println(mw);
        
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        // int ans = (watercontainer(height));
        // System.out.println(ans);
        optimal(height);
    }
}
