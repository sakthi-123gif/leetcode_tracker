// Last updated: 7/10/2026, 9:33:20 AM
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}