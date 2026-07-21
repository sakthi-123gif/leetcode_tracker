// Last updated: 7/21/2026, 9:51:21 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        boolean isDup=false;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(nums[i])){
7                isDup=true;
8            }
9            else{
10                map.put(nums[i],i);
11            }
12        }
13        if(isDup){
14            return true;
15        }
16        else
17        return false;
18    }
19}