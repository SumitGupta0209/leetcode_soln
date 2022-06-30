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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode ans=helper(root,val);
        return ans;
    }
    
    public static TreeNode helper(TreeNode node,int val)
    {
        
        if(node==null)
        {
            return new TreeNode(val);
        }
        
        
        if(val<node.val)
        {
          node.left=helper(node.left,val);  
        }
        else if(val>node.val)
        {
            node.right=helper(node.right,val);
        }
        
        
        return node;
        
    }
}