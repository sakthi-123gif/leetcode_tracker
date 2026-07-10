// Last updated: 7/10/2026, 9:33:36 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer>stack=new Stack<>();
        int []res=new int[temp.length];
        for(int i=0;i<temp.length;i++){
        while(!stack.empty() && temp[i]>temp[stack.peek()]){
            int idx=stack.pop();
            res[idx]=i-idx;
        }
        stack.push(i);
        }
        return res;
    }
}