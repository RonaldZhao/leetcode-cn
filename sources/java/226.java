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
    public TreeNode invertTree(TreeNode root) {
        help(root);
        return root;
    }
    
    private void help(TreeNode root) {
        if(root == null) {
            return;
        }
        help(root.left);
        help(root.right);
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}