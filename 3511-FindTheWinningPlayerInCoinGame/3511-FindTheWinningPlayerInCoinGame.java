// Last updated: 7/10/2026, 9:29:43 AM
class Solution {
    public String winningPlayer(int x, int y) {
        int count=0;
        while(x>0 && y>3){
            x=x-1;
            y=y-4;
            count++;

        }
        if(count%2==0) return "Bob";
        else return "Alice";
    }
}