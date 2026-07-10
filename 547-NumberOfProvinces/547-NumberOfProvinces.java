// Last updated: 7/10/2026, 9:34:00 AM
class Solution {
    public void bfs(int i,int [][]adj,boolean []visi){
       visi[i]=true;

       for(int j=0;j<adj.length;j++){
        if(adj[i][j]==1 && !visi[j]){
            bfs(j,adj,visi);
        }
       }

        
    }
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        int count=0;
        boolean [] visit=new boolean[v];
        for(int i=0;i<v;i++){
            if(visit[i]==false){
                count++;
                bfs(i,isConnected,visit);
            }
        }
        return count;
    }
}