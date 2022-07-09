class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> hset = new HashSet<>();
        for(char ch : s.toCharArray())
            hset.add(ch);
        
        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(hset.contains(ch) && hset.contains(Character.toLowerCase(ch)))
               return ch+"";
        return "";
    }
}