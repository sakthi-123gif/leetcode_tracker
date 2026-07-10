// Last updated: 7/10/2026, 9:31:18 AM
class Solution {
    public int minTimeToType(String word) {
        int ans=0;
        char pointer='a';
        for(char ch:word.toCharArray()){
            int clockwise=Math.abs(ch-pointer);
            int counterclockwise=26-clockwise;
            ans+=Math.min(clockwise,counterclockwise)+1;
            pointer=ch;
        }
        return ans;
    }
}