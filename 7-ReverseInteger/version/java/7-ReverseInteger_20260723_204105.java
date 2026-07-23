// Last updated: 7/23/2026, 8:41:05 PM
1class Solution {
2    public int reverse(int x) {
3        long rev=0,num=0;
4        while(x!=0){
5            num=x%10;
6            rev=rev*10+num;
7            x=x/10;
8            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
9        }
10        return (int)rev;
11    }
12}