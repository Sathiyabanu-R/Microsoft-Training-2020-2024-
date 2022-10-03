class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
                if (nums.length==0) return null;
        return createBST(nums, 0 ,nums.length-1);
    }
    
    public TreeNode createBST(int[] nums, int start, int end){
        if (end<start) return null;
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, start, mid-1);
        root.right = createBST(nums, mid+1, end);
        return root;
    }
}
/*
Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */

