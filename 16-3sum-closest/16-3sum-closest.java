class Solution {
    
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int len = nums.length;
        int res = 0;
        for (int i = 0; i < len-2; i++)
        {
            int l = i + 1;
            int r = len-1;
            
            while(l < r)
            {
                int curSum = nums[i] + nums[l] + nums[r];
                if(Math.abs(curSum -target) < diff)
                {
                    diff = Math.abs(curSum -target);
                    res = curSum;
                }
                if(curSum > target)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return res;
    }
}