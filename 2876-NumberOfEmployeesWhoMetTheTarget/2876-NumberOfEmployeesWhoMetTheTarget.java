// Last updated: 7/10/2026, 9:30:06 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int x:hours){
            if(x>=target)
            count++;
        }
        return count;
    }
}