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
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathDown(root);
        return maxSum;
    }
        private int maxPathDown(TreeNode node)
        {
            if(node == null){
                return 0;
            }
            int leftMax = Math.max(0, maxPathDown(node.left));
            int rightMax = Math.max(0, maxPathDown(node.right));
            maxSum = Math.max(maxSum,leftMax + rightMax + node.val);
            return Math.max(leftMax, rightMax) + node.val;
        }
        
    
}