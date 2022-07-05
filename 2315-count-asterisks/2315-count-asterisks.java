class Solution {
    public int countAsterisks(String s) {
        String arr[]=s.split("\\|");
        int count=0;
        for(int i=0;i<arr.length;i=i+2)
        {
            String word=arr[i];
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                if(ch=='*')
                {
                    count++;
                }
            }
        }
        // if(count==0)
        // {
        //     return 0;
        // }
        // else
        // {
        return  count;
        // }
    }
}