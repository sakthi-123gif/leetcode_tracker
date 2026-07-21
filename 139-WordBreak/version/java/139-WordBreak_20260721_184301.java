// Last updated: 7/21/2026, 6:43:01 PM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int m = nums1.length, n = nums2.length;
4        if (m < n) {
5            int[] temp = nums1;
6            nums1 = nums2;
7            nums2 = temp;
8            m = nums1.length;
9            n = nums2.length;
10        }
11        int[] dp = new int[n + 1];
12        for (int i = 1; i <= m; i++) {
13            int prev = 0;
14            for (int j = 1; j <= n; j++) {
15                int curr = dp[j];
16                if (nums1[i-1] == nums2[j-1]) {
17                    dp[j] = prev + 1;
18                } else {
19                    dp[j] = Math.max(dp[j-1], curr);
20                }
21                prev = curr;
22            }
23        }
24        return dp[n];
25    }
26}