// Last updated: 7/10/2026, 9:32:27 AM
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length + 1];

        xor[0] = 0;

        for(int i = 1; i < xor.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i - 1];
        }

        int[] res = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            res[i] = xor[queries[i][1] + 1] ^ xor[queries[i][0]];
        }

        return res;
    }
}