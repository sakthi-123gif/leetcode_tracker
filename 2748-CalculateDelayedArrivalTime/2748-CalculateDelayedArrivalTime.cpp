// Last updated: 7/10/2026, 9:30:28 AM
class Solution {
public:
    int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        // if(arrivalTime+delayedTime%24)
        // return 0;
        // else
        // return arrivalTime+delayedTime;
        return (arrivalTime+delayedTime)%24;
    }
};