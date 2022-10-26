class Solution {
    public int smallestEvenMultiple(int n) {
        int res=n;
        while(res%2!=0){
            res=res+n;
        }
        return res;
    }
}
/*
Example 1:
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.

Example 2:
Input: n = 6
Output: 6
Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
*/
