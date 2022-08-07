class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        
        int dpArr[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        return dp(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1,dpArr);
    }
    
    public static int dp(int[][] a,int i,int j,int [][]dpArr)
    {
         if(i<0||j<0)
        {
            
            return 0;
        }
        if(a[i][j]==1&&i>=0&&j>=0)
        {
            return 0;
        }
       
        if(i==0&&j==0)
        {
            return 1;
        }
        if(dpArr[i][j]!=0)
        {
            return dpArr[i][j];
        }
        
        
        
        int up=dp(a,i-1,j,dpArr);
        int left=dp(a,i,j-1,dpArr);
        
        return dpArr[i][j]=up+left;
    }
}