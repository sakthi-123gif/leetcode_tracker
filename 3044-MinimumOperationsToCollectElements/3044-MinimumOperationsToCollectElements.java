// Last updated: 7/10/2026, 9:29:57 AM
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean []found=new boolean[k+1];
        int count=0;
        int op=0;
         for (int i = nums.size() - 1; i >= 0; i--) {
            op++;
            int num=nums.get(i);
            if (num <= k && !found[num]) {
                found[num] = true;
                count++;
                if (count == k) {
                    return op;
                }
            }
        }
        return op;
    }
}