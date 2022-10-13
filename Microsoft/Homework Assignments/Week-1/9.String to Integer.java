class Solution {
    public int myAtoi(String s) {
        int res=0,i=0,sign=1;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i>=s.length()){
            return 0;
        }
        if(s.charAt(i)=='+' ||s.charAt(i)=='-'){
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        if(i>=s.length()){
            return 0;
        }
        while(i<s.length() && s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
            if((res>Integer.MAX_VALUE/10)||(res==Integer.MAX_VALUE/10)&&(s.charAt(i)-'0'>Integer.MAX_VALUE%10)){
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=(res*10)+(s.charAt(i)-'0');
            i++;
        }
        return res*sign;
    }
}
/*
Example 1:
Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.

Example 2:
Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.

Example 3:
Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
*/
