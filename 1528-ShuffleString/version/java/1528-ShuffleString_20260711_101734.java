// Last updated: 7/11/2026, 10:17:35 AM
1class Solution {
2    public String sortSentence(String s) {
3        String[] words = s.split(" ");
4        String[] result = new String[words.length];
5
6        for(String word : words)
7        {
8            int pos = word.charAt(word.length()-1)-'1';
9            result[pos] = word.substring(0,word.length()-1);
10        }
11        return String.join(" ",result);
12    }
13}