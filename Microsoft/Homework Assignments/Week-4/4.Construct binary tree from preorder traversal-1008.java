class Solution {
    int[] preOrder;
    int[] inOrder;
    Map<Integer,Integer> map=new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preOrder=preorder;
        inOrder=inorder;
        int n=inorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=dfs(0,n-1);
        return root;
    }
    public TreeNode dfs(int s,int e){
        if(s>e){
            return null;
        }
        int curVal=preOrder[index++];
        TreeNode curr=new TreeNode(curVal);
        int mid=map.get(curVal);
        curr.left=dfs(s,mid-1);
        curr.right=dfs(mid+1,e);
        return curr;
    }
}
/*
Example 1:
Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

Example 2:
Input: preorder = [1,3]
Output: [1,null,3]    */
