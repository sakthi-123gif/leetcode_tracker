// Last updated: 7/11/2026, 9:48:26 AM
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        char[] ch=new char[s.length()];
4        int len=s.length();
5        for(int i=0;i<len;i++){
6            ch[indices[i]]=s.charAt(i);
7        }
8        return new String(ch);
9    }
10}