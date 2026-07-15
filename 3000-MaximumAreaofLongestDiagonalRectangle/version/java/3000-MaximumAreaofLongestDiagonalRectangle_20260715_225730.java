// Last updated: 7/15/2026, 10:57:30 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        double maxi = -1.0;
4        int res = 0;
5        
6        for (int[] rect : dimensions) {
7            int l = rect[0], b = rect[1];
8            double d = Math.sqrt((double)l * l + (double)b * b);
9            
10            if (d > maxi) {
11                maxi = d;
12                res = l * b;
13            } else if (d == maxi) {
14                res = Math.max(res, l * b);
15            }
16        }
17        
18        return res;
19    }
20}