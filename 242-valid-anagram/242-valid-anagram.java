class Solution {
    public boolean isAnagram(String s, String t) {
        //convert to array and then sort the array
        //Then check if both the arrays or equal
        char[] p= s.toCharArray();
        char[] q= t.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);
        return Arrays.equals(p,q);
    }
}