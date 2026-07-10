// Last updated: 7/10/2026, 9:32:28 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
           int digit=(int)(Math.log10(num))+1;
           if(digit%2==0)
           count++;
        }
        return count;
    }
}