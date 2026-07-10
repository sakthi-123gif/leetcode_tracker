// Last updated: 7/10/2026, 9:34:12 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int count=0;
        while(xor!=0){
            xor=(xor&(xor-1));
            count++;
        }
        return count;
    }
}