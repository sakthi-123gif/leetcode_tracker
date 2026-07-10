// Last updated: 7/10/2026, 9:31:06 AM
class Solution {
    public boolean checkValid(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!set1.add(mat[i][j])||!set2.add(mat[j][i])) return false;
            }
        }
        return true;
    }
}