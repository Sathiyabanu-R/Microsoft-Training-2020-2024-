class Solution {
    public int[] productExceptSelf(int[] nums) {
        // first step is to calculate product of all non zero integers in the array
        // also calculate frequency of zeroes in the array.
        int product=1;
        int flag=0;
        for(int i:nums){   // here i indicates the value in the array.
            if(i==0){ 
                flag++;
                continue;
            }
            product*=i;
        }
        for(int i=0;i<nums.length;i++){   // i indicates the index of nums
          
           // if all elements are non zero in the array, than product of all elements will be non-zero and every element will get a non-zero value after the calculations are over.
              if(flag==0){
                 nums[i]=product/nums[i];
              }
           // if zero appears only once, then for all the elements except that zero product of all alements will become zero.
              else if(flag==1){
                  nums[i]=nums[i]!=0 ? 0:product;
              }
            // if number of zeroes is more than 1, than for each elemrnt there will be an extra zero to make     product of other non zero elements equal to zero.
              else{
                 nums[i]=0;
              }
        }
        return nums;
    }
}
/*
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
