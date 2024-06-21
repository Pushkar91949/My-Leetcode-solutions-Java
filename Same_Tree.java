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
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{p, q});
        
        while (!stack.isEmpty()) {
            TreeNode[] nodes = stack.pop();
            TreeNode x = nodes[0];
            TreeNode y = nodes[1];
            
            if (x == null && y == null) {
                continue;
            }
            if (x == null || y == null) {
                return false;
            }
            if (x.val != y.val) {
                return false;
            }
            
            stack.push(new TreeNode[]{x.right, y.right});
            stack.push(new TreeNode[]{x.left, y.left});
        }
        
        return true;
    }
} // Question link: https://leetcode.com/problems/same-tree/
