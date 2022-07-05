class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
       List<List<Integer>> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,Math.abs(arr[i-1]-arr[i]));
        }
        
        for(int i=1;i<arr.length;i++)
        {
            if(min==Math.abs(arr[i-1]-arr[i]))
            {
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}