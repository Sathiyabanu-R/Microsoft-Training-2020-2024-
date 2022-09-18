class Solution {
    public int countSubstrings(String s) {
      int count = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str = s.substring(i,j);
                StringBuilder sb = new StringBuilder(str);
                if(sb.reverse().toString().equals(str)==true)
                    count++;
            }
        }
        return count;  
    }
}
/*
Example 1:
Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".

Example 2:
Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".   */
