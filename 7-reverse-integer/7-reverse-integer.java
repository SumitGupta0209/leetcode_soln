class Solution {
    public int reverse(int x) {
        int temp = 0;
        while(x!=0){
            if(temp>Integer.MAX_VALUE/10||(temp==Integer.MAX_VALUE/10&&Integer.MAX_VALUE%10<x%10))return 0;
            if(temp<Integer.MIN_VALUE/10||(temp==Integer.MIN_VALUE/10&&Integer.MIN_VALUE%10>x%10))return 0;
            temp=temp*10+x%10;
            x/=10;
        }
        return temp;
    }
}