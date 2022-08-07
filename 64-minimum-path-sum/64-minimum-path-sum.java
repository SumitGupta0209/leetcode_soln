class Solution {
    public int minPathSum(int[][] grid) {
        
         int n=grid.length;
        int m=grid[0].length;
        
        int dpArr[][]=new int[n][m];
        
        return dp(grid,n-1,m-1,dpArr);
            
    }
    
    public static  int dp(int [][]a,int i,int j ,int[][] dpArr)
    {
       if(i<0 || j<0)
            return 1001;
        if(i==0 && j==0)
            return a[i][j];
        
        if(dpArr[i][j]!=0)
        {
            return dpArr[i][j];
        }
        int left=a[i][j]+dp(a,i-1,j,dpArr);
        int up=a[i][j]+dp(a,i,j-1,dpArr);
        return dpArr[i][j]=Math.min(left,up);
        
    }
}