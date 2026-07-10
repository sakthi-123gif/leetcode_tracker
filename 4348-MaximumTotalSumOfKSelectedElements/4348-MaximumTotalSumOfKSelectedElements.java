// Last updated: 7/10/2026, 9:28:33 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Integer arr[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        Long [] c=new Long[k];
        for(int i=0;i<k;i++){
            c[i]=(long)Math.max(1,mul-i);
        }
        Arrays.sort(c,Collections.reverseOrder());

        long a=0;
        for(int i=0;i<k;i++){
            a+=(long)arr[i]*c[i];
        }
        return a;
    }
}