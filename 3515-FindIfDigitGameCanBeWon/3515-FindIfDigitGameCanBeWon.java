// Last updated: 7/10/2026, 9:29:41 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length,count1=0,count2=0;
       for(int i=0;i<n;i++){
            if(nums[i]<10){
                count1+=nums[i];
            }
            else{
                count2+=nums[i];
            }
           
       }
        return count1!=count2;
    }
}