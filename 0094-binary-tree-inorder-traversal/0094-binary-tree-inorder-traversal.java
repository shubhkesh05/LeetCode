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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;

        TreeNode current = root;
        while(current!=null || !st.isEmpty()){
            while(current != null){
                st.push(current);
                current = current.left;

            }

            current = st.pop();
            result.add(current.val);
            current = current.right;
          
            
        }

        return result;
    }
}