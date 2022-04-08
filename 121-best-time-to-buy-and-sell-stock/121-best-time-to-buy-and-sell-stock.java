class Solution {
    public int maxProfit(int[] prices) {

       int minsofar=prices[0];
        
        int maxp=0;
        for(int i=1;i<prices.length;i++)
        {
            
            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            
            maxp=Math.max(maxp,profit);
            
        }
        
        
        return maxp;

        }
}