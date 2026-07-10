// Last updated: 7/10/2026, 9:29:17 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        int min=0,max=0;
        int n=nums.length;
        Arrays.sort(nums);
        // if(n==1) return 0;
        for(int i=0;i<k;i++){
                min+=nums[i];
        }
           for(int i=n-1;i>=n-k;i--){
                max+=nums[i];
        }
        return Math.abs(max-min);
    }
}