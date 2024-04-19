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
    public boolean isBalanced(TreeNode root) {
        return dfs(root)!=-1;
    }
    
    public int dfs(TreeNode root) {
        
        if(root == null) {
            return 0;
        } 
        
        int leftL = dfs(root.left);
        if(leftL == -1) return -1; // at any time while recursion if LeftL is -1 return -1
        
        int rightL = dfs(root.right);
        if(rightL == -1) return -1; 
        
        if(Math.abs(leftL-rightL) > 1) return -1; // after complete recursion check the condition if its not balanced
        
        return 1 + Math.max(leftL, rightL);
    }
}