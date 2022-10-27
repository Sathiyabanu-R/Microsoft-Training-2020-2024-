class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        //Integer.MIN_VALUE is a constant in the Integer class that represents the minimum or least integer  value that can be represented in 32 bits.
        int max=Integer.MIN_VALUE;  // value of Integer.Min_value = -2147483648, -2^31. 
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
/*
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1
  
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
*/
