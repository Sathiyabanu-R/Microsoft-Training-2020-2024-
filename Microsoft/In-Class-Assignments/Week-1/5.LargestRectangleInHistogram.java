class Solution {
    public int largestRectangleArea(int[] heights) {
       if(heights.length==1){
           return heights[0];
       } 
        int[] left=new int[heights.length];
        int[] right=new int[heights.length];
        left[0]=-1;
        right[heights.length-1]=heights.length;
        for(int i=1;i<heights.length;i++){
            int temp=i-1;
            while(temp>=0 && heights[temp]>=heights[i]){
                temp=left[temp];
            }
            left[i]=temp;
        }
        for(int i=heights.length-2;i>=0;i--)
        {
          int temp=i+1;
            while(temp<heights.length && heights[temp]>=heights[i]){
                temp=right[temp];
            }
            right[i]=temp;
        }    
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,heights[i]*(right[i]-left[i]-1));
        }
        return max;
    }
}
/* Example 1:
Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units

Example 2:
Input: heights = [2,4]
Output: 4
*/
