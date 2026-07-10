// Last updated: 7/10/2026, 9:34:29 AM
class Solution {
    public int firstUniqChar(String s) {
        // char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            boolean ans=true;
            for(int j=0;j<s.length();j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    ans=false;
                    break;
                }
            }
            if(ans==true) return i;
              
        }
        return -1;
}
}