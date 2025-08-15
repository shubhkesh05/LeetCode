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
       return helper(root ,0);
    }
    private int helper(TreeNode root ,int currsum){
        if(root==null){
            return 0;
        }
        currsum=currsum*10+root.val;
        if(root.left==null &&root.right==null){
            return currsum;
        }
        int lsum=helper(root.left,currsum);
        int rsum=helper(root.right,currsum);
        return lsum+rsum;
    }
}