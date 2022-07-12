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
    boolean isBalancedFlag = true;
    
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftPart = maxDepth(root.left);
        int rightPart = maxDepth(root.right);
        
        if(Math.abs(leftPart-rightPart) > 1){
            isBalancedFlag = false;
        }
        
        int currentDepth = Math.max(leftPart, rightPart)+1;
        
        return currentDepth;
    }
    
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        
        return isBalancedFlag;
    }
}