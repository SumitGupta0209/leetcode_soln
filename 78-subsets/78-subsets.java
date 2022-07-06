class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        
        func(nums,0,list,result);
        
        return result;
        
    }
    
    public void func(int[] nums, int index,List<Integer> list, List<List<Integer>> result) {
        
        if(index >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[index]);
        func(nums,index+1,list,result);
        list.remove(list.size()-1);
        func(nums,index+1,list,result);
        
    } 
}