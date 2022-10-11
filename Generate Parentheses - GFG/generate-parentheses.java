//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        
        ArrayList<String>a=new ArrayList<>();
        f("",n,0,0,a);
        return a;
    }
    public static void f(String s,int n,int open,int close,ArrayList<String>a)
    {
        
        if(close==n)
        {
            a.add(s);
            return;
        }
        
        
        
        
        if(open>close)
        {
            f(s+")",n,open,close+1,a);
        }
        if(open<n)
        {
            f(s+"(",n,open+1,close,a);
        }
    }
}