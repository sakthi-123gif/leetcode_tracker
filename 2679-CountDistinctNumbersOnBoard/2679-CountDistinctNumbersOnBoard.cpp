// Last updated: 7/10/2026, 9:30:26 AM
class Solution {
public:
    int distinctIntegers(int n) {
        int digits=0;
        // for(int i=1;i<n;i++){
        //     if(n%i==1){
        //     digits++;
        //     }
        // // }
        // return digits;
        return n==1?1:n-1;
        
    }
};