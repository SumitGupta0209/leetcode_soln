class Solution {
    public int characterReplacement(String s, int k) {
        
        
        
        //maintain a character frequency array
        int[] freq = new int[26];
        
        //consider 2 pointers, l & r
        int l = 0, r = 0; //initially, both l & r are set at 0
        
        //stores the ans
        int maxlen = 0;
        
        //stores the character with maximum frequency
        int maxf  = 0;
    
        //continue till r is less than total string length
        while( r < s.length())
        {
            //get the character at index "r"
            char ch = s.charAt(r);
        
            freq[ch-'A']++; //increment its frequency
            
            //if current character's frequency is more than max freq.
            if( freq[ch-'A'] > maxf)
            {  
                maxf = freq[ch - 'A']; //update max freq.
            }
            
            //find the length of the window
            int len = r - l + 1;
            
            //calculate temp
            int temp = len - maxf;
            if( temp <= k)
            {
                //if len is more than maxlen
                if(len > maxlen )
                  {  
                    maxlen = len; //update maxlen
                  }
            } //otherwise
            else
            {
                char lch = s.charAt(l); //get the character at index "l"
                freq[lch - 'A']--; //decrease its frquency by 1
                l++; //update "l" pointer
            }
            
            r++; //update r in every iteration
        }
        
        return maxlen; //return ans
    }
}
