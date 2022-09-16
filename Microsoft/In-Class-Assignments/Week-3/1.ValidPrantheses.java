class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='{'){
                stack.push('}');   
            }
            else if(ch=='['){
                stack.push(']');
            }
           else{
            if(stack.isEmpty()||stack.pop()!=ch){
                return false;
            }
           }
        }
        return stack.isEmpty();
    }
}
/*
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false */
