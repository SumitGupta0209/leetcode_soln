class Solution {
    public int[] sortedSquares(int[] nums) {
        
         int i = 0;
        int j = nums.length - 1;

        int[] res = new int[nums.length];
        int indx = nums.length - 1;
        while(i <= j) {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];
            if(val1 > val2) {
                res[indx] = val1;
                i++;
            } else {
                res[indx] = val2;
                j--;
            }
            indx--;
        }
        
        return res;
       
        
        
    }
}