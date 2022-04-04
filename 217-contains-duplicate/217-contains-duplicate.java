class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}
//more optimised soln

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int sum=0;
        int maxSum=nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>maxSum)
            {
                maxSum=sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return maxSum;
    }
    
}
