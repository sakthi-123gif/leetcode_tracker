// Last updated: 7/10/2026, 9:31:59 AM
class Solution {
    public int numWaterBottles(int bot, int exc) {
       int drink=bot;
       int empty=bot;
       while(empty>=exc){
        int quo=empty/exc;
        drink+=quo;
        empty=(empty%exc)+quo;
       } 
       return drink;
    }
}