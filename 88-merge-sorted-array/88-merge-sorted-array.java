class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
int[] arr = new int[m + n];
int i = 0;
int j = 0;
int k = 0;
while(i < m && j < n)
{
//Adds the smallest value into the new array
if(nums1[i] >= nums2[j])
{
arr[k++] = nums2[j++];
}
else if(nums1[i] < nums2[j])
{
arr[k++] = nums1[i++];
}
}
//Adds leftover values from nums1
while(i < m)
{
arr[k++] = nums1[i++];
}
//Adds leftover values from nums2
while(j < n)
{
arr[k++] = nums2[j++];
}
//Copys the new array into nums1
for(int x = 0; x < arr.length; x++)
{
nums1[x] = arr[x];
}

}
}