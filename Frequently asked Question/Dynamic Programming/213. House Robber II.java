       // Houses are arranged in circle
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int skipLastHouse[]=new int[n-1];
        int skipFirstHouse[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            skipLastHouse[i] = nums[i];
            skipFirstHouse[i] = nums[i+1];
        }
        int skipLast=robHelper(skipLastHouse);
        int skipFirst=robHelper(skipFirstHouse);
        return Math.max(skipLast,skipFirst);
    }
    public int robHelper(int[] nums) {
        int n=nums.length;
        if(n<2){
            return nums[0];
        }
        int dp[]=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[n-1];
    }
}
/*
TC : O(n)   SC : O(n)

Example 1:
Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

Example 2:
Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.

Example 3:
Input: nums = [1,2,3]
Output: 3
*/
