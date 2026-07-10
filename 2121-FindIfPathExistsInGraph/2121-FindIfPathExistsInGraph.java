// Last updated: 7/10/2026, 9:31:16 AM
class Solution {
    public static boolean bfs(int s,int d,List<List<Integer>> li,int n){
       Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[li.size()];
        q.add(s);
        visit[s] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int num : li.get(curr)) {
                if (!visit[num]) {
                    q.add(num);
                     visit[num] = true;
                }
            }
        }
        return visit[d];
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int m=edges.length;
        for(int i=0;i<m;i++){
            int sv=edges[i][0];
            int ev=edges[i][1];
            adj.get(sv).add(ev);
            adj.get(ev).add(sv);
        }
        return bfs(source,destination,adj,n);
    }
}