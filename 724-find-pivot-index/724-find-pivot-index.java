class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++)
        {
            int j=i-1;
            int k=i+1;
            while(j>=0)
            {
                leftSum+=nums[j];
                j--;
            }
            
            while(k<nums.length)
            {
                rightSum+=nums[k];
                k++;
            }
            if(leftSum==rightSum)
            {
                return i;
            }
            else
            {
                leftSum=0;
                rightSum=0;
            }
        }
        return -1;
    }
}