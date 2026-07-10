// Last updated: 7/10/2026, 9:30:48 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int min=a<b?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
}