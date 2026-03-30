class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // starting from lower left corner
        int row=matrix.length-1, col=matrix[0].length-1;
        int i=row, j=0;
        while(i>=0&&j<=col){
            if(matrix[i][j]>target){
                i--;
            }else if(matrix[i][j]<target){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
}
