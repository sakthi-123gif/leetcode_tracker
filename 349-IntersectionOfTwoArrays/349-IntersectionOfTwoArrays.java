// Last updated: 7/10/2026, 9:35:18 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>res=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                    break;
                }
            }
        }
        int []ans=new int[res.size()];
        int index=0;
        for(int val:res){
            ans[index++]=val;
        }
        return ans;
    }
}