// class Solution {
//     public boolean isPalindrome(String s) {
        
//         String s1=s.toLowerCase();
//         StringBuilder sb=new StringBuilder(s1);
       
        
//         for(int i=0;i<s1.length();i++)
//         {
//             char ch=s1.charAt(i);
//             int ascii=(int)ch;
//            if(ascii>=65 && ascii<=90 || ascii>=97 && ascii <=122)
//            {
//                sb.append(s1.charAt(i));
//                // sb.toLoweCase();
//            }
               
//         }
        
//         // String temp=sb;
//          StringBuilder sb1=new StringBuilder(sb);
//          sb1.reverse();
//         return sb==sb1;
        
//     }
// }


class Solution{
    public boolean isPalindrome(String s) {
  s=s.toLowerCase();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isLetterOrDigit(s.charAt(i)))
            sb.append(s.charAt(i));
    }
    int n=sb.length()-1;
    for(int i=0;i<sb.length()/2;i++)
    {
        if(sb.charAt(i)!=sb.charAt(n-i))
            return false;
    }
    return true;
}
}