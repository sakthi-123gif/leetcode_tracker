// Last updated: 7/19/2026, 6:00:26 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3
4        int slow = nums[0];
5        int fast = nums[0];
6        do {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9        } while (slow != fast);
10        int slow2 = nums[0];
11
12        while (slow2 != slow) {
13            slow2 = nums[slow2];
14            slow = nums[slow];
15        }
16
17        return slow;
18    }
19}