// Last updated: 7/10/2026, 9:29:22 AM
class Solution {
    public int maxDistinct(String s) {
        Set<Character> hm=new HashSet<>();
        for(char ch:s.toCharArray())
            hm.add(ch);
         return hm.size();   
    }
}