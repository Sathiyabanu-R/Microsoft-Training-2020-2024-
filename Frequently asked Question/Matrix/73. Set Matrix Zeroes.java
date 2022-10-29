class Solution {
    public void setZeroes(int[][] matrix) {
    int r = matrix.length;
    int c = matrix[0].length;
    Set<Integer> row = new HashSet<Integer>();
    Set<Integer> col = new HashSet<Integer>();
    // We mark the rows and columns that are to be made zero
    for (int i = 0; i < r; i++) 
    {
      for (int j = 0; j < c; j++) 
      {
        if (matrix[i][j] == 0) 
        {
          row.add(i);
          col.add(j);
        }
      }
    }
    // Iterate over the array once again and using the rows and cols sets, update the elements.
    for (int i = 0; i < r; i++) 
    {
      for (int j = 0; j < c; j++) 
      {
        if (row.contains(i) || col.contains(j)) 
        {
          matrix[i][j] = 0;
        }
      }
    }
    }
}
/* TC : O(m*n)  SC : O(m+n)

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
