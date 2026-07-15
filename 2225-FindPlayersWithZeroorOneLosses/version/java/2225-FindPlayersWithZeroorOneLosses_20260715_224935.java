// Last updated: 7/15/2026, 10:49:35 PM
1class Solution {
2   public int maxTurbulenceSize(int[] A) {
3    int best = 0, clen = 0;
4
5    for(int i = 0; i < A.length; i++) {
6        if(i >= 2 && ((A[i-2] > A[i-1] && A[i-1] < A[i]) ||
7                      (A[i-2] < A[i-1] && A[i-1] > A[i])) ) {
8            // If the last three elements are turbulent, increment run length by 1.
9            clen++;
10        } else if(i >= 1 && A[i-1] != A[i]) {
11            // The last three elements are not turbulent, so we'll reset the run length.
12            // If the previous and current elements are not equal, the new run length is 2.
13            clen = 2;
14        } else {
15            // Otherwise, the new run length is 1.
16            clen = 1;
17        }
18        best = Math.max(best, clen);
19    }
20    return best;    
21}
22}