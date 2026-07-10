// Last updated: 7/10/2026, 9:34:04 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0,div=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
         return sum==num;
    }
}