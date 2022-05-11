class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                s.pop();
            }
            map.put(nums2[i],s.isEmpty() ? -1:s.peek());
            s.push(nums2[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}