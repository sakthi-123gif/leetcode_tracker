// Last updated: 7/10/2026, 9:29:37 AM
class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int sum=0;
                while(num!=0){
                     sum+=(num%10);
                    num/=10;
                    }
                    ans=Math.min(ans,sum);
        }
        return ans;
        
        
    }
}