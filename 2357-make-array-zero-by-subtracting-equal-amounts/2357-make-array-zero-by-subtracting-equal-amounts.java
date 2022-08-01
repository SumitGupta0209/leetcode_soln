class Solution {
    public int minimumOperations(int[] nums) {
        int i;
        HashSet<Integer> set = new HashSet<Integer>();
        for(i=0;i<nums.length;i++){
            if(nums[i] != 0){
                set.add(nums[i]);
            }
        }
        
        return set.size();
    }
}