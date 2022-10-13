class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currLevel=new ArrayList<>();
            while(size-- >0){
                TreeNode curr=q.poll();
                currLevel.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(currLevel);
        }
        return result;
    }
}
/*
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []   */

