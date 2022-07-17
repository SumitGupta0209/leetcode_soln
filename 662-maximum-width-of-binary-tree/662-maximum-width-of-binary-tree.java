/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode Node, int Num)
    {
        node=Node;
        num=Num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty())
        {
            int size=q.size();
            int min=q.peek().num;  // to make the index starting from 0
            
            int first=0, last=0;
            for(int i=0;i<size;i++)
            {
                int cur_index=q.peek().num-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0)
                {
                    first=cur_index;
                }
                 if(i==size-1)
                {
                    last=cur_index;
                }
                if(node.left!=null)
                {
                    q.add(new Pair(node.left, cur_index*2+1));
                }
                if(node.right!=null)
                {
                    q.add(new Pair(node.right, cur_index*2+2));
                }
            }
            ans=Math.max(ans, last-first+1);
        }
        return ans;
    }
}