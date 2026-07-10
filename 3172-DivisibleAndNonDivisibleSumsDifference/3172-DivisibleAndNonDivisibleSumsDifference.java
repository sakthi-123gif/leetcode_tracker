// Last updated: 7/10/2026, 9:29:54 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0)
                sum1+=i;
        }
        for(int i=1;i<=n;i++){
            if(i%m==0)
            sum2+=i;
        }
        return sum1-sum2;
    }
}