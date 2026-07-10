// Last updated: 7/10/2026, 9:34:06 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer>st=new Stack<>();
        int []res=new int [n];
        Arrays.fill(res,-1);
        for(int i=0;i<n*2;i++){
            int x=nums[i%n];
            while(!st.empty() && x>nums[st.peek()]){
                    res[st.pop()]=x;

            }
            st.push(i%n);
        }
        return res;
    }
}