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

    public int minDepth(TreeNode root) {
         if(root == null) {
             return 0;
         }
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         int cur = 0;
        
         while(!queue.isEmpty()) {
             cur++;
             int size = queue.size();
             for(int i = 0; i<size; i++) {
                 TreeNode current = queue.remove();
                 if(current.right == null && current.left == null) {
                     return cur;
                 }
                 if(current.left != null) {
                     queue.add(current.left);
                 }
                 
                 if(current.right != null) {
                     queue.add(current.right);
                 }
             }
         }
        
        return cur;
    }

}