class Solution {
    public int uniquePaths(int m, int n) {
        
        
        int dp[][]=new int[m][n];
        return f(0,0,m,n,dp);
        
    }
    public static int f(int i,int j,int m,int n,int dp[][])
    {
        if(i>=m||j>=n)
        {
            return 0;
        }
        if(i==m-1&&j==n-1)
        {
            return 1;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        
        int right=f(i,j+1,m,n,dp);
        int down=f(i+1,j,m,n,dp);
        return dp[i][j]=right+down;
    }
    
    
}