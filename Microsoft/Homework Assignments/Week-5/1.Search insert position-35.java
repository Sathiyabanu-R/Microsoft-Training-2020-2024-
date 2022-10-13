class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target) r=m;
            else l=m+1;
        }
        return nums[l]<target?l+1:l;
    }
}
/*
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4  */
