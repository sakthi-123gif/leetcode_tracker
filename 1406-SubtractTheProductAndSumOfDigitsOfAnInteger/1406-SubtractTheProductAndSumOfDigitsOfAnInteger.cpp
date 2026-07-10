// Last updated: 7/10/2026, 9:32:32 AM
class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0,mul=1;
        while(n!=0){
            int num=n%10;
            sum+=num;
            mul*=num;
            n/=10;
        }
        // // return sum;
        // while(n!=0){
        //     int nums=n%10;
        //     mul*=nums;
        //     n/=10;
        // }
        return mul-sum;
        // return mul-sum;
    }
};