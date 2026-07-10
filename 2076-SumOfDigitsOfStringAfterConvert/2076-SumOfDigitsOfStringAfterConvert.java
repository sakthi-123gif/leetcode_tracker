// Last updated: 7/10/2026, 9:31:23 AM
class Solution {
    public int getLucky(String s, int k) {
        int val=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
             val=s.charAt(i)-96;
            while(val>0){
                sum+=val%10;
                val/=10;
            }
        }
            for(int i=1;i<k;i++){
                int temp=0;
                while(sum>0){
                    temp+=sum%10;
                    sum/=10;
                  
                }
                  sum=temp;
            }
        
     return sum;
    }
}