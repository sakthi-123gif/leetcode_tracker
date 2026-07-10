// Last updated: 7/10/2026, 9:28:01 AM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,u=0;
        for(char ch:moves.toCharArray()){
            switch(ch){
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case '_':
                    u++;
                    break;
            }
        }
        return Math.abs(x)+Math.abs(y)+Math.abs(u);
    }
}