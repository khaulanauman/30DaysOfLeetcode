class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        //finding min price
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
            
        }
        return profit;
         
        
        
    }
}