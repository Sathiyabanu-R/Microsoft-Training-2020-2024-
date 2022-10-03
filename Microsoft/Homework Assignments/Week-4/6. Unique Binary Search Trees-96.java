class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        for (int i=1; i<=n; i++){
            for (int root=1; root<=i; root++){
                dp[i]+= (dp[root-1] * dp[i-root]);
            }
        }
        return dp[n];
    }
}
/*
Example 1:
Input: n = 3
Output: 5

Example 2:
Input: n = 1
Output: 1
*/
