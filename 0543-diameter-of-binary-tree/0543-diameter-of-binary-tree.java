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
    public static int height(TreeNode root){
    if(root==null){
        return 0;
    }
    int lh=height(root.left);
    int rh=height(root.right);;
    return Math.max(lh,rh)+1;
  }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ldia=diameterOfBinaryTree(root.left);
        int rdia=diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdia=lh+rh;
        return Math.max(selfdia,Math.max(ldia,rdia));
    }
}