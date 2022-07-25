
//Dynamic Programming building on top of intuitive solution

class Solution {
    
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        
        for(int i = 1; i <= n; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        
        return result;
    }
}