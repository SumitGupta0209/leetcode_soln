class Solution {
    public int balancedStringSplit(String s) {
        int len = s.length();
        int L = 0, R = 0, count = 0;
        
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'R')
                R++;
            if(s.charAt(i) == 'L')
                L++;
            if(R == L && R != 0)
            {
                count++;
            }
        }
        
        return count;
    }
}