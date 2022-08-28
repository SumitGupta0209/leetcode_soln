class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int dp[][]=new int[nums.length+1][nums.length+1];
        
      //  Arrays.fill(dp,-1);
        return f(0,-1,nums,dp);
    }
    
    public static int f(int idx,int prev_idx,int a[],int dp[][])
    {
        
        if(idx==a.length)
        {
            return 0;
        }
        
        
        if(dp[idx][prev_idx+1]!=0)return dp[idx][prev_idx+1];
        
        int not_take=0+f(idx+1,prev_idx,a,dp);
        
        int take=0;
        if(prev_idx==-1|| a[idx]>a[prev_idx])
        {
            take=1+f(idx+1,idx,a,dp);
        }
        
        return dp[idx][prev_idx+1]= Math.max(not_take,take);
    }
}