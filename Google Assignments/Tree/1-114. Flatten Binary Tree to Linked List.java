class Solution {
    public TreeNode flatten(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=flatten(root.left);
        TreeNode right=flatten(root.right);
        while(root.left !=null){
            left.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return right != null ? right : (left!=null ? left : root);
        /*if(right!=null){
            return right;
        }
        else{
            if(left!=null){
                return left;
            }
            else{
                return root;
            }
        }*/
    }
}
