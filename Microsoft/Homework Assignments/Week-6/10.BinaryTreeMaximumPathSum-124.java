class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMax=Math.max(dfs(root.left),0);
        int rightMax=Math.max(dfs(root.right),0);
        max=Math.max(max,leftMax+rightMax+root.val);
        return Math.max(leftMax,rightMax)+root.val;
    }
}
/*
Example 1:
Input: root = [1,2,3]
Output: 6
Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
  
Example 2:
Input: root = [-10,9,20,null,null,15,7]
Output: 42
Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
*/
