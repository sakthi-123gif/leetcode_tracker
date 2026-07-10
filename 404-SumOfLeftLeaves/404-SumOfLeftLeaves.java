// Last updated: 7/10/2026, 9:34:31 AM
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
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);
    }
    public int helper(TreeNode root,boolean isleft){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            if(isleft) return root.val;
            else return 0;
        }
        return helper(root.left,true)+helper(root.right,false);
    }

}