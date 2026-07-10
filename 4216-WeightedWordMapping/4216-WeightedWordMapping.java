// Last updated: 7/10/2026, 9:29:14 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String s:words){
            int totalweight=0;
            for(char c:s.toCharArray()){
                int index=c-'a';
                totalweight+=weights[index];
                
            }
            int mod=totalweight%26;
            char map=(char)('z'-mod);
            res.append(map);
        }
        return res.toString();
    }
}