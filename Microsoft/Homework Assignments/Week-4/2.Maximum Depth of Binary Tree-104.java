class Solution {
    public int maxDepth(TreeNode root) {
       if (root == null){
           return 0;
       }
     return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
    /* if (root == null){
            return 0;
      }
      int max = maxDepth(root.left);
      max = Math.max(max, maxDepth(root.right));
        
      return 1 + max;  
    }
} */   

/*
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: 3

Example 2:
Input: root = [1,null,2]
Output: 2   */
