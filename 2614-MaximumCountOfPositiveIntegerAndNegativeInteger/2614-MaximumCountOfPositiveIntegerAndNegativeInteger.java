// Last updated: 7/10/2026, 9:30:34 AM
class Solution {
    public int maximumCount(int[] nums) {
        int countp=0;
        int countm=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            continue;
            if(nums[i]>0)
                countp++;
            else countm++;
        }
        int max=Math.max(countp,countm);
        return max;
    }
}