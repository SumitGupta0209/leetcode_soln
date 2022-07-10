class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int w = 0; 
        for (int i=0; i<arr.length; i++) { 
            if (arr[i]%2==0) { 
                swap(arr, i, w++); 
            }
        }
        
        return arr; 
    }
    
    private void swap(int[] arr, int i, int j) { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
}