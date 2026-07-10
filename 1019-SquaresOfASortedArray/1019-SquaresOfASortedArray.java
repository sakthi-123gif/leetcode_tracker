// Last updated: 7/10/2026, 9:33:18 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=square(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
    public static int square(int n){
        int squa=n*n;
        return squa;
    }
}