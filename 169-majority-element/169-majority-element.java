class Solution {
    public int majorityElement(int[] nums) {
        
        int ansidx=0;
        int anscount=1;
        
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[ansidx])
            {
                anscount++;
            }
            else
            {
                anscount--;
            }
            
            if(anscount==0)
            {
                ansidx=i;
                anscount=1;
            }
        }
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==nums[ansidx])
           {
               count++;
           }
        }
        if (count>nums.length/2)
        {
            return nums[ansidx];
        }
        else
        {
            return -1;
        }
    }
}