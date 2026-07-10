// Last updated: 7/10/2026, 9:33:38 AM
class Solution {
    public int bfs(int i,int j,boolean[][] visi,int [][]grid,int row,int col){
        Queue<int[]> q=new LinkedList<>();
          int count=0;
        q.add(new int[]{i,j});
      
        visi[i][j]=true;
        int [][]dir={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
            int []curr=q.poll();
            count++;
            int x=curr[0];
            int y=curr[1];
           
            for(int k=0;k<4;k++){
                int nextr=x+dir[k][0];
                int nextcol=y+dir[k][1];
                if(nextr<row && nextr>=0 && nextcol<col && nextcol>=0 && visi[nextr][nextcol]==false && grid[nextr][nextcol]==1){

                    q.add(new int[] {nextr,nextcol});
                    visi[nextr][nextcol]=true;
                }
            }
        }
        return count;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visit=new boolean[m][n];
        int fin=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visit[i][j]!=true){
                   int ans= bfs(i,j,visit,grid,m,n);
                   if(ans>fin) 
                   fin=ans;
                }
            }
        }
        return fin;
    }
}