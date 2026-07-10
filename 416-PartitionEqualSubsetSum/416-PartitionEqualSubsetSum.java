// Last updated: 7/10/2026, 9:34:18 AM
class Solution {
    public static boolean helper(int n,int[] nums,int sum, Boolean[][]dp){
        if(sum==0) return true;
        if(n==0){
             return false;
        }
        if(dp[n][sum]!=null) 
        return dp[n][sum];
        boolean take=false;
       if(nums[n-1]<=sum){
         take=helper(n-1,nums,sum-nums[n-1],dp);
       }
       boolean nottake=helper(n-1,nums,sum,dp);
       dp[n][sum]=take||nottake;
       return dp[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
           Boolean [][] dp=new Boolean[n+1][sum+1];
            return helper(n,nums,sum/2,dp);
    }
}