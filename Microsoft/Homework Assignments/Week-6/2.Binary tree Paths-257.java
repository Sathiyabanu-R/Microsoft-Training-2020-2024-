class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<String>();
        if(root!=null){
            FormPath(root,"",ans);
        }
        return ans;
    }
    public void FormPath(TreeNode root,String path,List<String>ans){
        if(root.left==null && root.right==null){
            ans.add(path+root.val);
        }
        if(root.left!=null) FormPath(root.left,path+root.val + "->",ans);
        if(root.right!=null) FormPath(root.right,path+root.val + "->",ans);
    }
}
/*
Example 1:
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:
Input: root = [1]
Output: ["1"]
*/
