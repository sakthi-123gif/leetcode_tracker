// Last updated: 7/10/2026, 9:29:28 AM
class Solution {
    public int maxFreqSum(String s) {
        int []vow=new int[26];
        int []cons=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
                vow[ch-'a']++;
            else 
            cons[ch-'a']++;
        }
        Arrays.sort(vow);
        Arrays.sort(cons);
        return vow[vow.length-1]+cons[cons.length-1];
    }
}