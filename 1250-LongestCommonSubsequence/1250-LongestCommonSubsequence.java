// Last updated: 7/10/2026, 9:32:51 AM
class Solution {
    public static int helper(int n1,int n2,String ch1,String ch2,int [][]dp){
        if(n1==0 || n2==0) return 0;
          if(dp[n1][n2]!=-1) 
        return dp[n1][n2];

        if(ch1.charAt(n1-1)==ch2.charAt(n2-1)){
            return dp[n1][n2]=1+helper(n1-1,n2-1,ch1,ch2,dp);
        }
      

           return dp[n1][n2]=Math.max(helper(n1-1,n2,ch1,ch2,dp),helper(n1,n2-1,ch1,ch2,dp));
           
        }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int [][]dp=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
           Arrays.fill(dp[i],-1);
        }
        return helper(n1,n2,text1,text2,dp);
    }
}