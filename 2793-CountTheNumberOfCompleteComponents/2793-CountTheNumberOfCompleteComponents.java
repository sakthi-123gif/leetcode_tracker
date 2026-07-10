// Last updated: 7/10/2026, 9:30:11 AM
class Solution {
    int nodes;
    int degreeSum;
    public void dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        nodes++;
        degreeSum += adj.get(u).size();
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, adj, visited);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                nodes = 0;
                degreeSum = 0;
                dfs(i, adj, visited);
                if (degreeSum == nodes * (nodes - 1)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}