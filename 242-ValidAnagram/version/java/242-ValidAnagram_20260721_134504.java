// Last updated: 7/21/2026, 1:45:04 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3    
4
5    if(s.length()!=t.length()){
6        return false;
7    }
8    HashMap<Character,Integer> map=new HashMap<>();
9    for(char ch:s.toCharArray()){
10        map.put(ch,map.getOrDefault(ch,0)+1);
11    }
12
13    for(char ch:t.toCharArray()){
14        if(!map.containsKey(ch)){
15            return false;
16        }
17        map.put(ch,map.get(ch)-1);
18
19        if(map.get(ch)<0){
20            return false;
21        }
22    }
23    return true;
24    }
25}