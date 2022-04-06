class Solution {
    public int maxProfit(int[] prices){
    if (prices.length == 0 || prices.length == 1) return 0;
    int[] suffixMax = buildSuffixMax(prices);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++) {
        int profit = suffixMax[i] - prices[i]; // since we got max to the right for every element,                                                  //we can simply subtract the prices[i] to get profit
        max = Math.max(max, profit); // to get the max profit
    }
    if (max < 0) {
        return 0;
    }
    return max;
}

/*
 * This method builds an array containing max to the right for every element(non inclusive)
 */
private static int[] buildSuffixMax(int[] prices) {
    int max = Integer.MIN_VALUE;
    int[] suffixMax = new int[prices.length];
    suffixMax[suffixMax.length - 1] = -1;
    for (int i = suffixMax.length - 2; i >= 0; i--) {
        max = Math.max(max, prices[i + 1]);
        suffixMax[i] = max;
    }
    return suffixMax;
}
}