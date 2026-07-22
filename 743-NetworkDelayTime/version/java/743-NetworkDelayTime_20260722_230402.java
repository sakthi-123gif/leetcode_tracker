// Last updated: 7/22/2026, 11:04:02 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3
4        List<List<int[]>> adj = new ArrayList<>();
5
6        for (int i = 0; i <= n; i++) {
7            adj.add(new ArrayList<>());
8        }
9
10        for (int[] edge : times) {
11            int u = edge[0];
12            int v = edge[1];
13            int w = edge[2];
14
15            adj.get(u).add(new int[]{v, w});
16        }
17
18        PriorityQueue<int[]> pq =
19                new PriorityQueue<>((a, b) -> a[0] - b[0]);
20
21        int[] dist = new int[n + 1];
22        Arrays.fill(dist, (int)1e9);
23
24        dist[k] = 0;
25        pq.offer(new int[]{0, k});
26
27        while (!pq.isEmpty()) {
28
29            int[] curr = pq.poll();
30            int dis = curr[0];
31            int node = curr[1];
32
33            if (dis > dist[node]) continue;
34
35            for (int[] it : adj.get(node)) {
36
37                int adjNode = it[0];
38                int wt = it[1];
39
40                if (dis + wt < dist[adjNode]) {
41
42                    dist[adjNode] = dis + wt;
43                    pq.offer(new int[]{dist[adjNode], adjNode});
44                }
45            }
46        }
47
48        int ans = 0;
49
50        for (int i = 1; i <= n; i++) {
51            if (dist[i] == (int)1e9) return -1;
52            ans = Math.max(ans, dist[i]);
53        }
54
55        return ans;
56    }
57}