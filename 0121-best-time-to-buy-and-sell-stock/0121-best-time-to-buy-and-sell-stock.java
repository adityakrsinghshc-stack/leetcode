class Solution {
    public int maxProfit(int[] prices) {
        int bestprice = 0 ;
        int minprice = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < minprice){
                minprice = price;
            }
            else if(price - minprice > bestprice ){
                bestprice = price - minprice;
            }
        }
        return bestprice;
        
    }
}