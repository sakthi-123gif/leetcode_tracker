// Last updated: 7/10/2026, 9:34:14 AM
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            i++;
            n=n-i;
        }
        return i-1;
    }
}