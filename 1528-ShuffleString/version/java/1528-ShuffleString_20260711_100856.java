// Last updated: 7/11/2026, 10:08:56 AM
1class Solution {
2    public String truncateSentence(String s, int k) {
3        String words[]=s.split(" ");
4        StringBuilder str=new StringBuilder();
5        for(int i=0;i<k;i++){
6            str.append(words[i]);
7
8            if(i!=k-1){
9                str.append(" ");
10            }
11        }
12        return str.toString();
13    
14    }
15}