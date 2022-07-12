class Solution {
    public String largestOddNumber(String num) {
        int n = num.length(), i=n-1;
        while(i>=0){
            if(Character.getNumericValue(num.charAt(i))%2 != 0)
                return num.substring(0, i+1);
            i--;
        }
        return "";
    }
}