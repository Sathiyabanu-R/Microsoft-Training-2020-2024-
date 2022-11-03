class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[]=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(deque.size()>0 && deque.getFirst()<=i-k){
                deque.removeFirst();
            }
            while(deque.size()>0 && nums[deque.getLast()]<nums[i]){
                deque.removeLast();
            }
            deque.add(i);
            if(i>=k-1){
                result[i-k+1]=nums[deque.getFirst()];
            }
        }
        return result;
    }
}
