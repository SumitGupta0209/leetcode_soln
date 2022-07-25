class Solution {
public int findMaxForm(String[] strs, int m, int n) {

    int dp[][][]=new int[strs.length+1][m+1][n+1];
    for(int a[][]:dp)
    {
        for(int b[]:a)
            Arrays.fill(b,-1);
    }
        
    return rec(strs,m,n,0,dp);
}

int rec(String str[],int m,int n,int i,int dp[][][])
{
    if(i>=str.length)
        return 0;
    
    if(m==0 && n==0)
        return 0;
    
    if(dp[i][m][n]!=-1)
        return dp[i][m][n];
    
    int a=0;
    int b=0;
    
    if(zero(str[i])<=m && one(str[i])<=n)
        a=1+rec(str,m-zero(str[i]),n-one(str[i]),i+1,dp);
    
        b=rec(str,m,n,i+1,dp);
    
    return dp[i][m][n]=Math.max(a,b);
    
}
int zero(String str)
{
    int cnt=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='0')
            cnt++;
    }
    
    return cnt;
}

int one(String str)
{
    int cnt=0;
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='1')
            cnt++;
    }
    
    return cnt;
}
}