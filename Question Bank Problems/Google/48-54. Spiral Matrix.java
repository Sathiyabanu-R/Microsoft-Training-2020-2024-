class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int top = 0,left = 0,bottom = matrix.length -1,right = matrix[0].length -1;
        while(top <= bottom && left <= right){
			//Top Row
            for(int i = left ; i <= right ; i++){
                num.add(matrix[top][i]);
            }
            top++;
			//Right Column
            for(int i = top ; i <= bottom; i++){
                num.add(matrix[i][right]);
            }
            right--;
			//Bottom Row
            if(top <= bottom){
                for(int i = right; i >= left; i --){
                    num.add(matrix[bottom][i]);
                }
                bottom--;
            }
			//Left Column
            if(left <= right){
                for(int i = bottom; i >= top; i --){
                    num.add(matrix[i][left]);
                }
                left++;
            }
        }
        return num;
    }
}
