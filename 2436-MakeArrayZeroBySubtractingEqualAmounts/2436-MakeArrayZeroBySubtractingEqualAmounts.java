// Last updated: 7/10/2026, 9:30:56 AM
class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> s1=new HashSet<>();
        for(int a:nums){
            if(a>0)
            s1.add(a);
        }
        return s1.size();
    }
}