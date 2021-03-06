class Solution {
   public int divide(int dividend, int divisor) 
   {
    if (dividend == Integer.MIN_VALUE && divisor == -1) 
    {
        return Integer.MAX_VALUE;
    }
    boolean positive = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);
    if (dividend > 0)
    {
        dividend *= -1;
    }
    if (divisor > 0)
    {
        divisor *= -1;
    }
    if (divisor < dividend)
    {
        return 0;
    }
    int res = divisor;
    int count = 1;
    while (res > dividend - res) 
    {
        res = res + res;
        count  = count * 2;
    }
    if (positive)
    {
        return count + divide(dividend - res, divisor);
    }
    return 0 - count - divide(dividend - res, divisor);
}
}