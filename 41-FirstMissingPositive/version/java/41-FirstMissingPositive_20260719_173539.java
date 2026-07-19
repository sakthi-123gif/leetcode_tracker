// Last updated: 7/19/2026, 5:35:39 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4
5        int target = 1;
6        for (int n : nums) {
7            if (n > 0 && n == target) {
8                target++;
9            } else if (n > target) {
10                return target;
11            }
12        }
13
14        return target;
15    }
16}