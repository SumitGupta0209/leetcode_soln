class Solution{
    

public String greatestLetter(String s) {
    ArrayList<Character> al = new ArrayList<>();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isUpperCase(s.charAt(i)))
        {
         int a=s.charAt(i)-'A';
        for(int j=0;j<s.length();j++)
        {
            int b=s.charAt(j)-'a';
            if(a==b) al.add(s.charAt(i));   
        }
        }
    }
    Collections.sort(al);
    if(al.size()==0) return"";
    return al.get(al.size()-1)+"";
    
 }
}