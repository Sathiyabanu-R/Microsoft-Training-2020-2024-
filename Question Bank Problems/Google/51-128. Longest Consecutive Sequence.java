class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Map<Integer,Boolean> map=new HashMap<>();
        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }
        for(int num:nums){
            int current=1;
                 // Check in forward direction
            int nextNum=num+1;
            while(map.containsKey(nextNum) && map.get(nextNum)==false){
                current++;
                map.put(nextNum,Boolean.TRUE);
                // Move to the next number
                nextNum++;
            }
            // Check in reverse direction
            int prevNum=num-1;
            while(map.containsKey(prevNum) && !map.get(prevNum)){
                current++;
                map.put(prevNum,Boolean.TRUE);
                // Move to the previous number
                prevNum--;
            }
            max=Math.max(max,current);
        }
        return max;
    }
}

// TC : O(n)  SC : O(n)
