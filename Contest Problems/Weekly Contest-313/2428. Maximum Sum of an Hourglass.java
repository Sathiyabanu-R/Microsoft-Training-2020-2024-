class Solution {
    public int maxSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int s=0,max=0;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                s=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                if(s>max){
                    max=s;
                }
            }
        }
        return max;
    }
}
/*
Example 1:
Input: grid = [[6,2,1,3],[4,2,1,5],[9,2,8,7],[4,1,2,9]]
Output: 30
Explanation: The cells shown above represent the hourglass with the maximum sum: 6 + 2 + 1 + 2 + 9 + 2 + 8 = 30.

Example 2:
Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
Output: 35
Explanation: There is only one hourglass in the matrix, with the sum: 1 + 2 + 3 + 5 + 7 + 8 + 9 = 35.
*/
