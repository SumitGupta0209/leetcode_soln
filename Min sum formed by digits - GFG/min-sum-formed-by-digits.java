// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        PriorityQueue <Integer> pq = new PriorityQueue<>();
    
        // to store the 2 numbers formed by array elements to
        // minimize the required sum
        long a=0, b=0;
    
        // Adding elements in Priority Queue
        for(int i=0; i<n; i++)
            pq.add(arr[i]);
    
        // checking if the priority queue is non empty
        while(!pq.isEmpty())
        {
            a*=10;
            a+=pq.element();
            pq.remove();
            if(!pq.isEmpty())
            {
                b*=10;
                b+=pq.element();
                pq.remove();
            }
        }
        return a+b;
    }
}