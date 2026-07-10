// Last updated: 7/10/2026, 9:30:16 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
         return (arrivalTime+delayedTime)%24;
    }
}