// Last updated: 7/10/2026, 9:34:08 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> has=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int [] res=new int[nums1.length];
        Arrays.fill(res,-1);
        for(int x:nums2){
            while(!s.empty() && x>s.peek())
                has.put(s.pop(),x);
                s.push(x);
        }
        for(int i=0;i<nums1.length;i++){
            if(has.containsKey(nums1[i])){
                res[i]=has.get(nums1[i]);
            }
        }
    return res;
    }
}