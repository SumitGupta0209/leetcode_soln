class Solution {
    public String longestCommonPrefix(String[] strs) {
        String start = strs[0];
        if(strs.length == 1) return start;
        StringBuilder sb = new StringBuilder();
        int minLen = 201;
        
        for(String str: strs)
            minLen = Math.min(minLen, str.length()); // keep track of the minimum length amongst all the strings since this will be the MAX possible common prefix length we can get
        
        for(int i = 0; i < minLen; i++)
        {
            for(int j = 0; j < strs.length; j++)
            {
                if(start.charAt(i) != strs[j].charAt(i)) // if at any Point 2 characters at same Index from 2 Strings dont match, return the String we have built till this Point
                    return sb.toString();
            }
            sb.append(start.charAt(i)); // This means we have matches all Characters at a Given Index from all Strings
        }
        return sb.toString();
    }
}