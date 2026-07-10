// Last updated: 7/10/2026, 9:28:45 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxR=-1;

        for(int num:nums){
            int range=digitR(num);
            maxR=Math.max(maxR,range);
        }
        int sum=0;

        for(int num:nums){
            if(digitR(num)==maxR){
                sum+=num;
            }
        }
        return sum;
    }

    private int digitR(int n){
        int max=0;
        int min=9;

        while(n!=0){
            int digit=n%10;
            max=Math.max(max,digit);
            min=Math.min(min,digit);
            n/=10;
        }
        return max-min;
    }
}