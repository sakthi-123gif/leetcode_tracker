// Last updated: 7/10/2026, 9:28:19 AM
class Solution {
    public String[] createGrid(int m, int n) {
        String[]g=new String[m];
        for(int i=0;i<m;i++){
            StringBuilder row=new StringBuilder();
            for(int j=0;j<n;j++){
                if(i==0 ||j==n-1){
                    row.append('.');
                }
                else{
                    row.append('#');
                }
            }
            g[i]=row.toString();
        }
        
        return g;
    }
}