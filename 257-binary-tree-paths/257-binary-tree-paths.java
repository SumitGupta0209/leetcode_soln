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
    List<String> res = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, new StringBuilder());
        return res;
    }
    
    public void helper(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        int len = sb.length();
        sb.append(node.val);
        
        if (node.left == null && node.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            helper(node.left, sb);
            helper(node.right, sb);
        }
        // deleting the extra characters we added
        sb.setLength(len);
    }
}