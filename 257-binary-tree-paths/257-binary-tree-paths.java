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
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<String>();
		return path(root, "", res);
	}

	public List<String> path(TreeNode root, String curr, List<String> res){
		curr+=String.valueOf(root.val);
		if(root.right == null && root.left == null){
			res.add(curr);
			return res;
		}
		else if(root.right == null) path(root.left, curr + "->", res);
		else if(root.left == null) path(root.right, curr + "->", res);
		else if(root.right == null) path(root.left, curr + "->", res);
		else{
			path(root.left, curr + "->", res);
			path(root.right, curr + "->", res);
		}
		return res;
	}

}