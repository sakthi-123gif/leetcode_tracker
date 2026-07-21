// Last updated: 7/21/2026, 9:14:10 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int i1=0;
4        int i2=0;
5        boolean iscrt=false;
6        for(int i=0;i<nums.length;i++){
7            for(int j=i+1;j<nums.length;j++){
8                if(nums[i]+nums[j]==target){
9                iscrt=true;
10                i1=i;
11                i2=j;
12                break;
13                }
14            }
15             if(iscrt){
16            break;
17             }
18        }
19
20        if(iscrt){
21            return new int[]{i1,i2};
22        }
23        return new int[]{};
24       
25    }
26}