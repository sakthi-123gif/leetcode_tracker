// Last updated: 7/10/2026, 9:31:13 AM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0;
        int count=0;
        for(int n:nums){
            if(n<target) less++;
            else if(n==target) count++;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<count;i++){
            res.add(less+i);
        }
        return res;
    }
}