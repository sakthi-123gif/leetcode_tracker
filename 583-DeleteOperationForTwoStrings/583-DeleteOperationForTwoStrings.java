// Last updated: 7/10/2026, 9:33:55 AM
class Solution {
    public static int helper(int m,int n,String w1,String w2,int [][]dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(w1.charAt(m-1)==w2.charAt(n-1)){
            dp[m][n]=1+helper(m-1,n-1,w1,w2,dp);
             return dp[m][n];
        }
       
        else{
            dp[m][n]= Math.max(helper(m-1,n,w1,w2,dp),helper(m,n-1,w1,w2,dp));
            return dp[m][n];
        }
    }
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int [][]dp=new int [m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=helper(m,n,word1,word2,dp);
        return n+m-2*ans;
    }
}