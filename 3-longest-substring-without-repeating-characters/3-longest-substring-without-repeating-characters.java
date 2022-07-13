class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null | s.isEmpty()) return 0;;
        
        Set<Character> charSet = new HashSet<Character>();
        
        int l = 0;
        
        int longestSubstring = 0;
        
        for (int r = 0; r < s.length(); r++) {
            
            char rChar = s.charAt(r);
            
            if (charSet.contains(rChar)) {
                
                while (s.charAt(l) != rChar) {
                    charSet.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            
            else charSet.add(rChar);
            
            longestSubstring = Math.max(longestSubstring, r-l+1);
        }
        
        return longestSubstring;
    }
}