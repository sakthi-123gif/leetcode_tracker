// Last updated: 7/10/2026, 9:31:26 AM
class Solution {
    public int arraySign(int[] nums) {
       int  negative=0;
        for(int x:nums){
            if(x==0) return 0;
            if(x<0) negative++; 
        }
        return (negative%2==1)?-1:1;
    }
}