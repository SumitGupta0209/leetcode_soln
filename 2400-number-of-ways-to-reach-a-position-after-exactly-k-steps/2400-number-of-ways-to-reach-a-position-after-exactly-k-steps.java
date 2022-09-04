class Solution {
    int dp[][];
    public int numberOfWays(int s, int e, int k) {
        dp=new int[4001][1001];
        for(int i[]:dp)
            Arrays.fill(i,-1);
        return find(s,e,k);
    }
    public int find(int s, int e, int k)
    {
        if(k==0)
        {
            if(s==e)
                return 1;
            return 0;
        }
        if(dp[s+2001][k]!=-1)
            return dp[s+2001][k];
        int a=find(s+1, e, k-1);
        int b= find(s-1, e, k-1);
        return dp[s+2001][k]=(a+b)%1000000007;
    }
}