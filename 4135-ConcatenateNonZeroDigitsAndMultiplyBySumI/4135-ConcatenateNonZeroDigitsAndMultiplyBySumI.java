// Last updated: 7/10/2026, 9:29:20 AM
class Solution {
    public long sumAndMultiply(int n) {
        String n1=String.valueOf(n);
        StringBuilder str=new StringBuilder();
        int len=n1.length();
        for(int i=0;i<len;i++){
            if(n1.charAt(i)!='0'){
                str.append(n1.charAt(i));
            }
        }
        if(str.length()==0){
            return 0;
        }
        int n3=Integer.parseInt(str.toString());
        int org=n3;
        int sum=0;
        while(org>0){
            int digit=org%10;
            sum+=digit;
            org/=10;
        }
        long result=(long)n3*sum;
        return result;
        
    }
}