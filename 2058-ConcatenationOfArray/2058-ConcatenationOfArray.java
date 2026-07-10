// Last updated: 7/10/2026, 9:31:24 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int []ans=new int[2*n];
        System.arraycopy(nums,0,ans,0,n);
        System.arraycopy(nums,0,ans,n,n);
         return ans;
    }
}