class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        PriorityQueue<Integer> pqeven = new PriorityQueue<>();
        PriorityQueue<Integer> pqodd = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                pqeven.offer(nums[i]);
            }
            else
                pqodd.offer(nums[i]);
        }
        
        for(int i=0;i<nums.length;i=i+2)
        {
            nums[i]=pqeven.remove();
        }
        for(int i=1;i<nums.length;i=i+2)
        {
            nums[i]=pqodd.remove();
        }
        return nums;
    }
}