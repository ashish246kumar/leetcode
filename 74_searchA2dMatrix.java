class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(j>=0&&i<=matrix.length-1)
        {
            if(target==matrix[i][j])
            {
                return true;
            }
            else if(target>matrix[i][j])
            {
                i=i+1;
            }
            else{
                j=j-1;
            }
        }
        return false;
    }
}