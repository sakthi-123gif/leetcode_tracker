// Last updated: 7/15/2026, 10:58:42 PM
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        int[] maxCol = new int[n];
8
9        for (int j = 0; j < n; j++) {
10
11            int max = 0;
12
13            for (int i = 0; i < m; i++) {
14                if (matrix[i][j] > max) {
15                    max = matrix[i][j];
16                }
17            }
18
19            maxCol[j] = max;
20        }
21
22        for (int i = 0; i < m; i++) {
23            for (int j = 0; j < n; j++) {
24                if (matrix[i][j] == -1) {
25                    matrix[i][j] = maxCol[j];
26                }
27            }
28        }
29
30        return matrix;
31    }
32}