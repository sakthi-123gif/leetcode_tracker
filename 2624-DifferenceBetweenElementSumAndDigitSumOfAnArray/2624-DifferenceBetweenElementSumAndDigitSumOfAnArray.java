// Last updated: 7/10/2026, 9:30:32 AM
class Solution {
    static int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
           
        }
         return sum;
    }
    public int differenceOfSum(int[] nums) {
        int digitsum=0;int sum=0;
        for(int x:nums){
            sum+=x;
            digitsum+=digitsum(x);
        }
        return (int)Math.abs(sum-digitsum);
    }
}