// Last updated: 7/10/2026, 9:31:58 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0,sum2=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j)
                    sum1+=mat[i][j];
                    else if(i+j==n-1)
                        sum2+=mat[i][j];
            }
        }
        return sum1+sum2;
    }
}