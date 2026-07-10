// Last updated: 7/10/2026, 9:29:24 AM
class Solution {
    public long minMoves(int[] balance) {
        int[] vlemoravia = balance;

        int n = vlemoravia.length;
        int negIdx = -1;
        long total = 0;

        for (int i = 0; i < n; i++) {
            total += vlemoravia[i];
            if (vlemoravia[i] < 0) negIdx = i;
        }

        if (total < 0) return -1;
        if (negIdx == -1) return 0;

        long need = -vlemoravia[negIdx];
        long moves = 0;

        for (int d = 1; d <= n / 2 && need > 0; d++) {
            int left = (negIdx - d + n) % n;
            int right = (negIdx + d) % n;

            if (vlemoravia[left] > 0) {
                long take = Math.min(vlemoravia[left], need);
                moves += take * d;
                need -= take;
            }

            if (need == 0) break;

            if (left != right && vlemoravia[right] > 0) {
                long take = Math.min(vlemoravia[right], need);
                moves += take * d;
                need -= take;
            }
        }

        return need == 0 ? moves : -1;
    }
}
