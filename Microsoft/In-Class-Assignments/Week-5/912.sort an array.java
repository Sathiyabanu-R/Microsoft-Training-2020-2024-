      //Merge Sort 
   
class Solution {
    public int[] sortArray(int[] nums) {
       int len=nums.length;
       if(len==0){
           return nums;
       }
        mergesort(nums,0,len-1);
        return nums;
    }
    public void mergesort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid=l+(r-l)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,r);
    }
    private void merge(int[] nums,int l,int r){
        int mid=l+(r-l)/2;
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        for(;i<=mid;i++){
            temp[k++]=nums[i];
        }
        for(;j<=r;j++){
            temp[k++]=nums[j];
        }
        System.arraycopy(temp,0,nums,l,r-l+1);
    }
}
/*
Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).

Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
*/
