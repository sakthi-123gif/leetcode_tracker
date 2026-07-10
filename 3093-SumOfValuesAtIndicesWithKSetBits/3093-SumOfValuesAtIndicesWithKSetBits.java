// Last updated: 7/10/2026, 9:29:55 AM
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            if(Integer.bitCount(i)==k)
            sum+=nums.get(i);
        }
        return sum;
}
}