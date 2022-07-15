class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                list.add(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        return list;
    }
}