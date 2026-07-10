// Last updated: 7/10/2026, 9:30:36 AM
class Solution {
    public int countDigits(int num) {
        int init=num,count=0;
        while(num!=0){
            int last=num%10;
            if(init%last==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}