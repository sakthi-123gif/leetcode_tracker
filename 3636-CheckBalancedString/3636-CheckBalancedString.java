// Last updated: 7/10/2026, 9:29:33 AM
class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0;
        for(int i=0;i<num.length();i++){
           if(i%2==0){
            even+=num.charAt(i)-'0';
           }
           else
           odd+=num.charAt(i)-'0';
        }
        return (even==odd);
    }
}