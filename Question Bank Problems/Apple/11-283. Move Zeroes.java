class Solution {
    public void moveZeroes(int[] nums) {
     int i=0;
     for(int j=0; j<=nums.length-1; j++) {
     int temp=0;
     if(nums[i]==0 && nums[j]!=0) {
         temp=nums[j];
         nums[j]=nums[i];
         nums[i]=temp;
     }
     if(nums[i]!=0) {
         i++;
     }
   } 
 }
}
