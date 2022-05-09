class Solution {
public int romanToInt(String str) {
    int sum=0;
    int prev=0;
    
    for(int i=0;i<str.length();i++){
        int num=0;
        char ch=str.charAt(i);
        num=ch=='I'?1:ch=='V'?5:ch=='X'?10:ch=='L'?50:ch=='C'?100:ch=='D'?500:ch=='M'?1000:0;
        
        prev=prev<num? prev :0 ;
        sum=sum+num-prev-prev;
    
        prev=num;
        
    }
    
    return sum;
}  }