class Solution {
    public String addBinary(String s1, String s2) {
        int i=s1.length()-1, j=s2.length()-1, carry=0;
        String res="";
        while(i>=0||j>=0||carry!=0){
            int c1=i<0?0:s1.charAt(i)-'0';
            int c2=j<0?0:s2.charAt(j)-'0';
            int val = c1^c2^carry;
            res=val+res;
            carry = (c1&c2)|(c2&carry)|(c1&carry);
            i--;
            j--;
        }
        return res;
    }
}