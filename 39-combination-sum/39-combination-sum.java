class Solution {
   
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Combine(0,candidates,target,ans, new ArrayList<>());
        return ans;
    }
    static void Combine(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> li){
        if(index>=arr.length){
            if(target==0){
                ans.add( new ArrayList<>(li));
                
            }
            return ;
        }
        
        if(arr[index]<=target){
            li.add(arr[index]);
            Combine(index,arr,target-arr[index],ans, li);
            li.remove(li.size()-1);
        }
        Combine(index+1,arr,target,ans, li);
    }
}