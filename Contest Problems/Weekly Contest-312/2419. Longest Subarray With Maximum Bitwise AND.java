class Solution {
    public int longestSubarray(int[] nums) {
        int m=0,n=nums.length,max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max){
                c++;
            }
            else{
                m=Math.max(m,c);
                c=0;
            }
        }
        m=Math.max(m,c);
        return m;
    }
}
/*
Example 1:
Input: nums = [1,2,3,3,2,2]
Output: 2
Explanation:
The maximum possible bitwise AND of a subarray is 3.
The longest subarray with that value is [3,3], so we return 2.

Example 2:
Input: nums = [1,2,3,4]
Output: 1
Explanation:
The maximum possible bitwise AND of a subarray is 4.
The longest subarray with that value is [4], so we return 1.
*/
