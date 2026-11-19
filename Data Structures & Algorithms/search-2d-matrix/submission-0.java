class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix[s].length-1;
        while(s<matrix.length && e>=0){
            if(matrix[s][e]==target){
                return true;
            }
            else if(matrix[s][e]<target){
                s=s+1;
            }
            else{
                e=e-1;
            }
        }
        return false;
    }
}
