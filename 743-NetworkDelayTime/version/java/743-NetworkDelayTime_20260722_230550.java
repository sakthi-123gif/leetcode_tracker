// Last updated: 7/22/2026, 11:05:50 PM
1public class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        int rows = heights.length, cols = heights[0].length;
4        int[][] dist = new int[rows][cols];
5        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
6        minHeap.add(new int[]{0, 0, 0});
7        
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                dist[i][j] = Integer.MAX_VALUE;
11            }
12        }
13        dist[0][0] = 0;
14        
15        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
16        
17        while (!minHeap.isEmpty()) {
18            int[] top = minHeap.poll();
19            int effort = top[0], x = top[1], y = top[2];
20            
21            if (effort > dist[x][y]) continue;
22            
23            if (x == rows - 1 && y == cols - 1) return effort;
24            
25            for (int[] dir : directions) {
26                int nx = x + dir[0], ny = y + dir[1];
27                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
28                    int new_effort = Math.max(effort, Math.abs(heights[x][y] - heights[nx][ny]));
29                    if (new_effort < dist[nx][ny]) {
30                        dist[nx][ny] = new_effort;
31                        minHeap.add(new int[]{new_effort, nx, ny});
32                    }
33                }
34            }
35        }
36        return -1;
37    }
38}