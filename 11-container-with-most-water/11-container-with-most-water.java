class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0,p_max=0;
        while(i<j)
        {
            p_max=(j-i)*(Math.min(height[i],height[j]));
            max=Math.max(p_max,max);
            if(height[j]<height[i])
                j--;
            else
                i++;
        }
        return max;
    }
}