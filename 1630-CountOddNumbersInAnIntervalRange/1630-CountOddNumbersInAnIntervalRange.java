// Last updated: 7/10/2026, 9:32:02 AM
class Solution {
    public int countOdds(int low, int high) {
        int range=(high-low)+1;
        if(low%2!=0 && high%2!=0) return range/2+1;
        else return range/2;
    }
}