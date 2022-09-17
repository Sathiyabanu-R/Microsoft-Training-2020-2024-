class Solution {
    List<Integer> l=new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null){
            return l;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        l.add(root.val);
       return l;
    }
} 
/*
Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]
*/
