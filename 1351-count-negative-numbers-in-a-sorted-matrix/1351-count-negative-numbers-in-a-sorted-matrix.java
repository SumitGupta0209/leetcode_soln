class Solution {
   public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            int index = getFirstNegativeElementIndex(grid[i]);
            int n = grid[i].length;
            if (index != -1)
                count += (n - index);
        }
        return count;
    }
    
    public int getFirstNegativeElementIndex(int[]arr) {
        int low = 0, high = arr.length-1, mid;
        int index = -1;
        
        while(low <= high) {
            mid = low + (high - low)/2;
                
            if (arr[mid] < 0) {
                index = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return index;
    }
}