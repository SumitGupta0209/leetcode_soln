class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int l = 0, r = 0;

        while (r < nums.length) {
            if (sum < target) {
                sum += nums[r++];
            }
            while (sum >= target) {
                minLength = Math.min(minLength, r - l);
                sum -= nums[l++];
            }

        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}