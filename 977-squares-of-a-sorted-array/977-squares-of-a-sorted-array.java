class Solution {
    public int[] sortedSquares(int[] nums) {
        
        
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        int arr[]=new int[nums.length];
        while(i<=j)
        {
            int val1=nums[i]*nums[i];
            int val2=nums[j]*nums[j];
            if(val1<val2)
            {
                arr[index--]=val2;
                j--;
            }
            else
            {
                arr[index--]=val1;
                i++;
            }
        }
        return arr;
    }
}