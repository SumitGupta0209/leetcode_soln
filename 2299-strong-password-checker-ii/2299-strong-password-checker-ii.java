class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean digit = false,lower = false,upper = false,special = false;
    
        if(password.length()<8)
        {
            return false;
        }
    char[] ch = password.toCharArray();
    
    for(int i = 0 ; i<ch.length ; i++)
    {
        if(i>0 && ch[i] == ch[i-1])return false;
        
        if(Character.isDigit(ch[i])){
            digit = true;
        }
        else if(Character.isLowerCase(ch[i]))lower = true;
        else if(Character.isUpperCase(ch[i]))upper = true;
        else{
            String tem = ch[i]+"";
            if(password.contains(tem))special = true;
                            
        }
    }
    return (digit && special && upper && lower);

        
    }
}