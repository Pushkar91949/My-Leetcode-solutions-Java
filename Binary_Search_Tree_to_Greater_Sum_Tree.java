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
    public TreeNode bstToGst(TreeNode root) {
        int[] nodeSum = {0};
        helper(root, nodeSum);
        return root;
    }
    
    private void helper(TreeNode root, int[] nodeSum) {
        if (root == null) {
            return;
        }
        helper(root.right, nodeSum);
        nodeSum[0] += root.val;
        root.val = nodeSum[0];
        helper(root.left, nodeSum);
    }
}
