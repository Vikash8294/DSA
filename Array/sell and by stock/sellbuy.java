public class sellbuy {
    public static void buysell(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;
        int maxp = Integer.MIN_VALUE;
        for(int i=0; i<price.length; i++){
            if(buyprice < price[i]){
                profit = price[i] - buyprice;
                maxp = Math.max(maxp, profit);
            }
            else{
            buyprice = price[i] ;
            }
        }
        System.out.println(maxp);
        }
    
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        buysell(price);
        
    }
}
