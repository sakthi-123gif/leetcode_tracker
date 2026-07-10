// Last updated: 7/10/2026, 9:30:58 AM
class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                 if(i==j||i+j==n-1){
                    if(grid[i][j]==0) return false; 
                 }
                 else{
                    if(grid[i][j]!=0) return false;
                 }
            }
        }
        return true;
    }
}