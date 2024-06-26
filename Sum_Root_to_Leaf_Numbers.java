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
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode node, int curSum) {
        if (node == null) {
            return 0;
        }
        curSum = curSum * 10 + node.val;
        if (node.left == null && node.right == null) {
            return curSum;
        }
        int leftSum = dfs(node.left, curSum);
        int rightSum = dfs(node.right, curSum);
        return leftSum + rightSum;
    }
} // Question link: https://leetcode.com/problems/sum-root-to-leaf-numbers/
