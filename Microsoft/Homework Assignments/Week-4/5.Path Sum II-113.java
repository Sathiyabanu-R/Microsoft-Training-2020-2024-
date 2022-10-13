class Solution {
    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return res;
        }
        dfs(root,targetSum,new LinkedList<>());
        return res;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer>path){
        targetSum-=root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && targetSum==0){
            res.add(new LinkedList<>(path));
        }
        else{
            if(root.left!=null){
                dfs(root.left,targetSum,path);
            }
            if(root.right!=null){
                dfs(root.right,targetSum,path);
            }
        }
        path.remove(path.size()-1);
    }
}
/*
Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: []

Example 3:
Input: root = [1,2], targetSum = 0
Output: []   */

