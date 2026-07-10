// Last updated: 7/10/2026, 9:29:44 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int x:nums){
            if(x%3!=0)
                count++;
        }
        return count;
    }
}