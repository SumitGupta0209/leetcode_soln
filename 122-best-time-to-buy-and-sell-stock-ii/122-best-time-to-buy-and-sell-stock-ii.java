class Solution {

//In this solution, we are trying to buy the stock if the previous day's price is lower than the current price
//. We will buy the stock at the previous price and sell it today to make a profit. If we repeat this for all such days 
//(where the current price is higher than the previous day's price), we can add all the profits to get the total profit.
public int maxProfit(int[] prices) {
    if(prices == null || prices.length <= 1 ){
        return 0;
    }
    
    int totalprofit = 0;
    for(int i = 1; i<prices.length; i++){
        if(prices[i-1]<prices[i]){              //we'll buy
            totalprofit += prices[i]-prices[i-1];
        }
    }
    return totalprofit;
}
}