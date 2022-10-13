class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);

       }
       Queue<Integer> pq=new PriorityQueue<>((n1,n2)->map.get(n2)-map.get(n1));
       for(int n:map.keySet()){
           pq.add(n);
       }
       int[] ans=new int[k];
       for(int i=0;i<k;i++){
         ans[i]=pq.poll();
       }
       return ans;
    }
}
/*
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]
*/
