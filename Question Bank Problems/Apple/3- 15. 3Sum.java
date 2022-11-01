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
