class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0, max=0;
        for(int i: weights)
        {
            sum+=i;
            if(max<i) max=i;
        }
        int d=(int) sum/days;
        int min=Math.max(d,max);
        int ans=-1, low=min, high=sum;
        while(low<=high)
        {
            int mid= (int) (low+high)/2;
            int check= validate(mid, weights);
            if(check<=days)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans; 
    }
    public int validate(int maxCap, int[] w)
    {
        int ans=1, sum=0;
        for(int i=0; i<w.length ; i++)
        {
            sum+=w[i];
            if(sum>maxCap)
            {
                ans++;
                sum=w[i];
            }
        }
        return ans;
        
    }
}