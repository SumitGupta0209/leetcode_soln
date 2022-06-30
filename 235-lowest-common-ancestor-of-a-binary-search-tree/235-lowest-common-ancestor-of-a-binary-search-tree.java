/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans=helper(root,p,q);
        
        return ans;
        
    }
    
    public static TreeNode helper(TreeNode node,TreeNode p,TreeNode q)
    {
        if (p.val < node.val && q.val < node.val)
        {
             return helper(node.left, p, q);
        } 
        else if (p.val > node.val && q.val > node.val)
        {
            return helper(node.right, p, q);
        } 
        else 
        {
            return node;
        }
            
    }
}