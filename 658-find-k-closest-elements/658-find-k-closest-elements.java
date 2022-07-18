class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> al=new ArrayList<>();
        int l=0;
        int r=arr.length-1;
        int mid=-1;
        
        
        while(l<=r){
            mid=l+(r-l)/2;
            
            if(arr[mid]==x){
                break;
            }
            
            if(x<arr[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        int ptr1=-1;
        int ptr2=-1;
        
        if(mid>=1){
            ptr1=mid-1;
            ptr2=mid;
        }else{
            ptr1=mid;
            ptr2=mid+1;
        }
        
   
        while(ptr1>=0 && ptr2<arr.length && k!=0){
            int val1=Math.abs(x-arr[ptr1]);
            int val2=Math.abs(arr[ptr2]-x);
            
            if(val1<=val2){
                al.add(arr[ptr1]);
                ptr1--;
            }else{
                al.add(arr[ptr2]);
                ptr2++;
            }
            
            k--;
        }
        
        if(k!=0){
            if(ptr1<0){
                while(ptr2<arr.length && k!=0){
                    al.add(arr[ptr2]);
                    ptr2++;
                    k--;
                }
            }else{
                while(ptr1>=0 && k!=0){
                    al.add(arr[ptr1]);
                    ptr1--;
                    k--;
                }
            }
        }
        
        Collections.sort(al);
        return al;
    }
}