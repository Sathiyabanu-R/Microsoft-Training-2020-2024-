class Solution {
    public int longestContinuousSubstring(String s) {
    int ans=1;
    int count=1;
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)-s.charAt(i-1)==1){
            count++;
        }
        else{
            count=1;
        }
        ans=Math.max(ans,count);
    }
    return ans;
}
}
/*
Example 1:
Input: s = "abacaba"
Output: 2
Explanation: There are 4 distinct continuous substrings: "a", "b", "c" and "ab".
"ab" is the longest continuous substring.

Example 2:
Input: s = "abcde"
Output: 5
Explanation: "abcde" is the longest continuous substring.
*/
