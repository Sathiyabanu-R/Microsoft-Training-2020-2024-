class Solution {
    public int rob(TreeNode root) {
        int temp[]=travel(root);
        return Math.max(temp[0],temp[1]);
    }
    public int[] travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[] leftNode=travel(root.left);
        int[] rightNode=travel(root.right);
        int temp[] = new int[2];
        temp[0]=root.val+leftNode[1]+rightNode[1];
        temp[1]=Math.max(leftNode[0],leftNode[1])+Math.max(rightNode[0],rightNode[1]);
        return temp;
    }
}
/* TC: O(n)  SC : O(n)

Example 1:
Input: root = [3,2,3,null,3,null,1]
Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.

Example 2:
Input: root = [3,4,5,1,3,null,1]
Output: 9
Explanation: Maximum amount of money the thief can rob = 4 + 5 = 9.
*/
