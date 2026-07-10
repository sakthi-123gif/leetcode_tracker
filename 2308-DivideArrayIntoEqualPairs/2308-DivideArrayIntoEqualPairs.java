// Last updated: 7/10/2026, 9:31:04 AM
class Solution {
    public boolean divideArray(int[] nums) {
        int freq[]=new int[501];
        for(int num:nums){
            freq[num]++;
        }
        for(int n:freq){
            if(n%2!=0){
                return false;
            }
        
        }
            return true;
    }
}