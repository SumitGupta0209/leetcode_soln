class Solution {
    int c=0;
    public int numberOfSteps(int num) {
        
        
        int c=0;
        int ans =help(num,c);
        return ans;
        
    }
    
    public static int help(int num, int c)
    {
        if(num==0)
        {
            return c;
        }
        
        if(num%2==0)
        {
             return help(num/2,c=c+1);
        }
        else
        {
           
           return help(num-1,c=c+1);
        }
      
    }
}