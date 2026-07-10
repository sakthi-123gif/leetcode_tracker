// Last updated: 7/10/2026, 9:31:11 AM
class Solution {
public:
    bool isSameAfterReversals(int num) {
        // int rev=0;
        // while(num>0){
        //     num=num%10;
        //     int rev=rev*10+num;
        //     num/=10;
        // }
        if(num==0)return true;
        if(num%10==0){
            return false;
        }
        return true;
    }
      
    };