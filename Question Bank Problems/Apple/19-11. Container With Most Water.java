class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxArea=0;
        while(left<right){
            // area =length ->(min(left,right))  *  width -> (right-left)
           int area=Math.min(height[left],height[right]) * (right-left);
           maxArea=Math.max(area,maxArea);
           if(height[left] < height[right]){
                left++;
           }
           else{
                right--;
           }
        }
        return maxArea;
    }
}
// TC : O(n)   SC : O(1)
