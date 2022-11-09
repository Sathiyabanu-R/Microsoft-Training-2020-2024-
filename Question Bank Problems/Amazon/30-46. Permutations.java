class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList =new ArrayList<>();
        backtrack(resultList,new ArrayList<>(),nums);
        return resultList;
    }
    public void backtrack(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums){
            // If we match the length, it is a permutation
        if(tempList.size()==nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int n:nums){
            // Skip if we get same element
            if(tempList.contains(n)){
                continue;
            }
            // Add the new element
            tempList.add(n);
     
            // Go back to try other element
            backtrack(resultList, tempList, nums);
        
            // Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }
}
// TC: O(n! * n)  SC: O(n) -> where n is stack space choosen
