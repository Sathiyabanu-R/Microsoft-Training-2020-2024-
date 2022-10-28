class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // adding list inside list
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        if(n<3){
            return list;
        }
        for(int i=0;i<=n-3;i++){
                // &&  ---> satisfy both condition true.
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=n-1;
            // a+b+c --> a+b = 0-c --> both side the values are equal.
            int sum=0-nums[i];
            while(left<right){
                if(sum==nums[left]+nums[right]){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);   // adding the list l to list (list)
                    
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]<sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
/*
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
*/
