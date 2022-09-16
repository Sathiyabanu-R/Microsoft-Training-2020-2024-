class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack= new Stack<>();
        StringBuilder res=new StringBuilder();
        String[] p=path.split("/");
        for(int i=0;i<p.length;i++){
            if(!stack.isEmpty() && p[i].equals("..")){
                stack.pop();
            }
            else if(!p[i].equals("")&&!p[i].equals(".")&&!p[i].equals("..")){
                stack.push(p[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            res.insert(0,stack.pop()).insert(0,"/");
        }
       return res.toString();
    }
}
/*
Example 1:
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.

Example 2:
Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.

Example 3:
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.   */
