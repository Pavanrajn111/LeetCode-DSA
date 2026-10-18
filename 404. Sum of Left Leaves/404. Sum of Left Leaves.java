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
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        visit(root,false);
        return this.sum;

    }
    private void visit(TreeNode node,boolean isLeftChild){
        if(node != null)
        {
            if(node.left == null && node.right == null && isLeftChild){
                this.sum += node.val;
            }
            visit(node.left , true);
            visit(node.right, false);
        }
    }
}