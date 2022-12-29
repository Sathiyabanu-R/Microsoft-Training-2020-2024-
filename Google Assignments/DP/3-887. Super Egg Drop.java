class Solution {
    public int superEggDrop(int k, int n) {
        int dp[][]=new int[n+1][k+1];
        int c=0;
        while(dp[c][k] < n){
            c++;
            for(int i=1;i<=k;i++){
                dp[c][i]=dp[c-1][i-1]+dp[c-1][i]+1;
            }
        }
        return c;
    }
}
