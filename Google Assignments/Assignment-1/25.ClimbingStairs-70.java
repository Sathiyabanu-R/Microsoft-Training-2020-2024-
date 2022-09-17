class Solution {
    public int climbStairs(int n) {
        int stairs[]=new int[n+4];
        stairs[0]=0;
        stairs[1]=1;
        stairs[2]=2;
        for(int i=3;i<=n;i++){
            stairs[i]=stairs[i-1]+stairs[i-2];
        }
        return stairs[n];
    }
}
/*
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/
