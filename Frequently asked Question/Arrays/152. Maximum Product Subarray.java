class Solution {
	public int maxProduct(int[] nums) {
		int max= nums[0];
		int currmax = 1, currmin = 1; 

		for(int i=0;i<nums.length;i++){
		  if(nums[i]==0){ 
              currmax = 1; 
              currmin = 1; 
          }
          int temp = currmax * nums[i];
		  currmax = Math.max(nums[i], Math.max(temp, currmin*nums[i]));
		  currmin = Math.min(nums[i], Math.min(temp, currmin * nums[i]));
		  max= Math.max(max, currmax);
		}
		return max;
	}
}  
  -------------------------------------------------------------------------------------------------
          //Kadane's Algorithim
  class Solution{
    public int maxProduct(int[] nums) {
        int mpp=nums[0];     // mpp: maximum Positive Product
        int mnp=nums[0];     // mnp: Minimum Negative Product
        int omax=nums[0];    // overall maximum Product
        for(int i=1;i<nums.length;i++){
            int val=nums[i];
            if(val<0){
                int temp1=mnp;
                int temp2=mpp;
                mpp=Math.max(val,temp1*val);
                mnp=Math.min(val,temp2*val);  
            }
            else{
               mpp=Math.max(val,val*mpp);
               mnp=Math.min(val,val*mnp); 
            }
            omax=Math.max(mpp,omax);
        }
        return omax;
    }
 }

/*
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/
