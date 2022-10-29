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
/* TC : O(n)   SC : O(1)

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
*/
