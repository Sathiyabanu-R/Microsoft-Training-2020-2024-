class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int[] leftSide=new int[n];
        int[] rightSide=new int[n];
        leftSide[0]=1;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                leftSide[i]=leftSide[i-1]+1;
            }
            else{
                leftSide[i]=1;
            }
        }
        rightSide[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<=nums[i+1]){
                rightSide[i]=rightSide[i+1]+1;
            }
            else{
                rightSide[i]=1;
            }
        }
        for(int i=1;i<n-1;i++){
            if(leftSide[i-1]>=k && rightSide[i+1]>=k){
                res.add(i);
            }
        }
        return res;
    }
}
/*
Example 1:
Input: nums = [2,1,1,1,3,4,1], k = 2
Output: [2,3]
Explanation: There are two good indices in the array:
- Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order.
- Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order.
Note that the index 4 is not good because [4,1] is not non-decreasing.

Example 2:
Input: nums = [2,1,1,2], k = 2
Output: []
Explanation: There are no good indices in this array.
*/
