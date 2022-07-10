class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Queue for Non-Increasing
        
		
        for(int i=1;i<nums.length;i += 2) {
            pq.add(nums[i]);
        }
        
		// First sort the odd indices and place them in array 
        for(int i=1;i<nums.length;i += 2) {
            nums[i] = pq.remove();
        }
        
		// Initialize the same queue again but in Increasing fashion and repeat the same for even indices
        pq = new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i += 2) {
            pq.add(nums[i]);
        }
        
        for(int i=0;i<nums.length; i += 2) {
            nums[i] = pq.remove();
        }
        
        return nums;
    }
}