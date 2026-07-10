// Last updated: 7/10/2026, 9:30:07 AM
class Solution {
    public int distanceTraveled(int m, int a) {
        int total=0;
        while(m>=5){
            total+=50;
            m-=5;
            if(a>=1){
                m++;
                a--;
            }
        }
        return total+(m*10);
       
    }
}