// Last updated: 7/20/2026, 9:28:06 PM
1class Solution {
2    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
3        // Compute shortest distances between all pairs of cities
4        int[][] floyd = floydWarshall(n, edges);
5
6        // Mark cities beyond the threshold as unreachable
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < n; j++) {
9                if (floyd[i][j] > distanceThreshold) {
10                    floyd[i][j] = -1;
11                }
12            }
13        }
14
15        int answer = -1;
16        int minReachable = Integer.MAX_VALUE;
17
18        // Count reachable cities for every city
19        for (int i = 0; i < n; i++) {
20            int count = 0;
21
22            for (int j = 0; j < n; j++) {
23                if (floyd[i][j] != -1) {
24                    count++;
25                }
26            }
27
28            // Update answer, preferring the larger index in case of a tie
29            if (count <= minReachable) {
30                minReachable = count;
31                answer = i;
32            }
33        }
34
35        return answer;
36    }
37
38    private int[][] floydWarshall(int n, int[][] edges) {
39        int[][] adj = new int[n][n];
40
41        // Initialize all distances as unreachable
42        for (int[] row : adj) {
43            Arrays.fill(row, -1);
44        }
45
46        // Build the adjacency matrix
47        for (int[] edge : edges) {
48            int u = edge[0];
49            int v = edge[1];
50            int wt = edge[2];
51
52            adj[u][v] = wt;
53            adj[v][u] = wt;
54        }
55
56        // Distance from a city to itself is always 0
57        for (int i = 0; i < n; i++) {
58            adj[i][i] = 0;
59        }
60
61        // Floyd-Warshall Algorithm
62        for (int k = 0; k < n; k++) {
63            for (int i = 0; i < n; i++) {
64                for (int j = 0; j < n; j++) {
65
66                    // Skip if either path does not exist
67                    if (adj[i][k] == -1 || adj[k][j] == -1) {
68                        continue;
69                    }
70
71                    // First valid path found
72                    if (adj[i][j] == -1) {
73                        adj[i][j] = adj[i][k] + adj[k][j];
74                    }
75
76                    // Update with a shorter path if available
77                    else if (adj[i][j] > adj[i][k] + adj[k][j]) {
78                        adj[i][j] = adj[i][k] + adj[k][j];
79                    }
80                }
81            }
82        }
83
84        return adj;
85    }
86}