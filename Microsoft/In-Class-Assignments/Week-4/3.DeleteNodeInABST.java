class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
    if (root == null)
            return null;
        //deletion if root is found
        if (root.val == key) {
            //if no children branch
            if (root.left == null && root.right == null)
                root = null;
            //only right branch
            else if (root.left == null)
                root = root.right;
            //only left branch
            else if (root.right == null)
                root = root.left;
            //both left and right children exist
            else if (root.left != null && root.right != null) {
                TreeNode tmp = root.left;
                while (tmp.right != null)
                    tmp = tmp.right;
                tmp.right = root.right;
                root = root.left;
            }
        }
        else if (root.val < key)
            root.right = deleteNode(root.right, key);
        else
            root.left = deleteNode(root.left, key);
        return root;
    }
}
/*
Example 1:
Input: root = [5,3,6,2,4,null,7], key = 3
Output: [5,4,6,2,null,null,7]
Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.

Example 2:
Input: root = [5,3,6,2,4,null,7], key = 0
Output: [5,3,6,2,4,null,7]
Explanation: The tree does not contain a node with value = 0.

Example 3:
Input: root = [], key = 0
Output: []    */
