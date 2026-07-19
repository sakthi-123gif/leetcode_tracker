// Last updated: 7/19/2026, 6:06:00 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int totalSum = 0;
4        int leftSum = 0;
5        
6        for(int i = 0;i < nums.length; i++){
7            totalSum += nums[i];
8        }
9        for(int i=0; i < nums.length; i++){
10            int rightSum = totalSum - nums[i] - leftSum;
11
12            if(leftSum == rightSum){
13                return i;
14            }
15            leftSum +=nums[i];
16        }
17        return -1;
18
19    }
20}