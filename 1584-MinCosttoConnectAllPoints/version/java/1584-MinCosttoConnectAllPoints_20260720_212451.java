// Last updated: 7/20/2026, 9:24:51 PM
1class Solution {
2    public int minCostConnectPoints(int[][] points) {
3        int n = points.length;
4        int min_cost = 0;
5        boolean[] visited = new boolean[n];
6        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // [cost, vertex]
7        Map<Integer, Integer> cache = new HashMap<>();
8        pq.offer(new int[]{0, 0});
9
10        while (!pq.isEmpty()) {
11            int[] edge = pq.poll();
12            int cost = edge[0];
13            int u = edge[1];
14
15            if (visited[u]) {
16                continue;
17            }
18
19            visited[u] = true;
20            min_cost += cost;
21
22            for (int v = 0; v < n; v++) {
23                if (!visited[v]) {
24                    int dist = Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
25                    if (dist < cache.getOrDefault(v, Integer.MAX_VALUE)) {
26                        cache.put(v, dist);
27                        pq.offer(new int[]{dist, v});
28                    }
29                }
30            }
31        }
32
33        return min_cost;
34    }
35}