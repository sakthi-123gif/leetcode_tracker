// Last updated: 7/10/2026, 9:33:33 AM
class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int n=mat.length;
        for(int i=1;i<n;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]!=mat[i-1][j-1]) return false;
            }
        }
        return true;
    }
}