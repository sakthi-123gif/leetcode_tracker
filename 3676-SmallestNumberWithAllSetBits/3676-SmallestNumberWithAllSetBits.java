// Last updated: 7/10/2026, 9:29:31 AM
class Solution {
    public int smallestNumber(int n) {
        int n1=0;
        while(true){
           if((n&(n+1))!=0)
           n++;
           else
           break;
        }
        return n;
    }
}