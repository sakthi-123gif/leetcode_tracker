// Last updated: 7/10/2026, 9:32:15 AM
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for(int n:nums){
            total+=n;
        }
        List<Integer> res=new ArrayList<>();
        int curr=0;
        for(int i=nums.length-1;i>=0;i--){
            curr+=nums[i];
            res.add(nums[i]);
            if(curr>total-curr) break;
        }
        return res;
    }
}