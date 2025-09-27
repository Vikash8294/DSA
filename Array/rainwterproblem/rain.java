public class rain {
    public static void rainwter(int num[]) {
        //calculate the left max value
        int leftmax []= new int[num.length];
        leftmax[0] = num[0];
        int trapedwater =0;
        for(int i=1 ; i< num.length; i++){
            leftmax[i]= Math.max(leftmax[i-1], num[i]);
        }
        //calculate the right max value
        int rightmax [] = new int[num.length];
        rightmax[num.length-1] = num[num.length-1]; 
        for(int i= num.length-2 ; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], num[i]);
        }

        for(int i=0;i<num.length; i++){
            // waterlevel = min(rightmax, leftmax)
                int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // tarpedwter =  wtaerlevel - num[i] 
                int watertraped = waterlevel - num[i];
                trapedwater = trapedwater + watertraped;

            }
            System.out.println(trapedwater);
        }
        
      
        
    
public static void main(String[] args) {
    int num[] ={4,2,0,6,3,2,5};
    // int num[] ={5,2,1,0,10};
    
    rainwter(num);
}    
}
