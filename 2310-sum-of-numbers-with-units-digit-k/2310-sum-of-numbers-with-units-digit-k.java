class Solution {
int res=Integer.MAX_VALUE;
Integer dp[][];
public int minimumNumbers(int num, int k) {

    if(num==0)
        return 0;
    List<Integer> al=new ArrayList<>();
    dp=new Integer[num+1][num+1];
    for(int i=0;i<num;i++)
    {
        if((i+1)%10==k)
            al.add(i+1);
    }
    int t[]=new int[al.size()];
    for(int i=0;i<al.size();i++)
        t[i]=al.get(i);
    int x=fun(t,0,num,k);
    return x>=3007?-1:x;
    
    
}
int  fun(int t[],int i,int num,int k)
{
    if(t.length==i ||  num<0)
        return 30007;
    if(num==0)
    {
        return 0 ;
    }
    if(dp[i][num]!=null)
        return dp[i][num];
    if(t[i]%10==k && num>=t[i])
    {
        return dp[i][num]=Math.min(1+fun(t,i,num-t[i],k),fun(t,i+1,num,k));
        
        
    }
    else
        return dp[i][num]=fun(t,i+1,num,k);
    

}
}