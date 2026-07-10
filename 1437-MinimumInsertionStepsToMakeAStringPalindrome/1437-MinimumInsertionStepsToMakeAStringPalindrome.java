// Last updated: 7/10/2026, 9:32:23 AM
class Solution {
    public int minInsertions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return n-helper(n, n, s, rev, dp);
    }
    public int helper(int n1, int n2, String s1, String s2, int[][] dp) {
        if (n1 == 0 || n2 == 0) return 0;
        if (dp[n1][n2] != -1)
            return dp[n1][n2];
        if (s1.charAt(n1 - 1) == s2.charAt(n2 - 1)) {
            return dp[n1][n2] = 1 + helper(n1 - 1, n2 - 1, s1, s2, dp);
        }
        return dp[n1][n2] = Math.max(
                helper(n1 - 1, n2, s1, s2, dp),
                helper(n1, n2 - 1, s1, s2, dp)
        );
    }
  
}