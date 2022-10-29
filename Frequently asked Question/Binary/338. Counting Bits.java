class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2]+i%2;  
        }
        return ans;
    }
}
/* TC : O(n)   SC : O(1)

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
*/
