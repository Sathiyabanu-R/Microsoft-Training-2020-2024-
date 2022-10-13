class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
       if(root.val==p.val || root.val==q.val){
           return root;
       } 
       if(root.left==null && root.right==null){
           return null;
       }
        TreeNode left=null,right=null;
        if(root.left!=null){
            left=lowestCommonAncestor(root.left,p,q);
        }
        if(root.right!=null){
            right=lowestCommonAncestor(root.right,p,q);
        }
        if(left!=null && right!=null){
            return root;
        }
        return left==null?right:left;
        
    }
}
/*
Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.

Example 2:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

Example 3:
Input: root = [1,2], p = 1, q = 2
Output: 1
*/
