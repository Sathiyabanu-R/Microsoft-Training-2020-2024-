class Solution {
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(Math.abs(left-right) > 1) res = false;
        return Math.max(left, right)+1;
    }
} 
/*
Example 1: 
Input: root = [3,9,20,null,null,15,7]
Output: true 
  
Example 2:
Input: root = [1,2,2,3,3,null,null,4,4]
Output: false

Example 3:
Input: root = []
Output: true
*/
