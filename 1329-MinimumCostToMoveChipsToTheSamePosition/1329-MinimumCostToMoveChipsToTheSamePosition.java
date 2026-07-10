// Last updated: 7/10/2026, 9:32:39 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int onecount=0,zerocount=0;
        for( int i=0;i<position.length;i++){
            if(position[i]%2==0){
                zerocount++;
            }
            else{
                onecount++;
            }

        }
        return Math.min(zerocount,onecount);
}
}