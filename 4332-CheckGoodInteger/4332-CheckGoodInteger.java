// Last updated: 7/10/2026, 9:29:03 AM
class Solution {
    public boolean checkGoodInteger(int n) {
      if(n<0) return false;
        int square=squareSum(n);
        int digit=digitSum(n);
        return (square-digit)>=50;
    }
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n/=10;
        }
        return sum;
    }
    public int squareSum(int n){
        int sqrsum=0;
        while(n!=0){
            int rem=n%10;
            sqrsum+=(rem*rem);
            n/=10;
        }
        return sqrsum;
    }
}