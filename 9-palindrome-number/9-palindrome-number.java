// class Solution {
//     public boolean isPalindrome(int x) {
        
//         // int temp=x;
        
//       String s=Integer.toString(Math.abs(x));
        
//         String word="";
//         for(int i=0;i<s.length();i++)
//         {
//              word=word+s.charAt(i);
//         }
       
        
//         boolean ans=s.equals(word);
        
//         return ans;
        
//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        
        int i =0,j=input.length()-1;
        while(i<=j || i==j){
            if(input.charAt(i)!=input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}