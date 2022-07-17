// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		  stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling rotateArr() function
            ArrayList<Integer> res=Solution.reverse(stack);
            for(int ii=0;ii<res.size();ii++){
                System.out.print(res.get(ii));
                if(ii!=res.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static void insert_at_bottom(Stack<Integer> s, int x){
        if(s.size()==0){
            s.add(x);
        }
        else{
            int y= s.peek();
            s.pop();
            insert_at_bottom(s, x);
            s.add(y);
        }
    }
    static void fun(Stack<Integer> s){
        if(s.size()>0){
            int x=s.peek();
            s.pop();
            fun(s);
            insert_at_bottom(s, x);
        }
    }
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        // add your code here
        fun(s);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!s.isEmpty()){
            ans.add(s.peek());
            s.pop();
        }
        Collections.reverse(ans);
        return ans;
    }

}