// Last updated: 7/10/2026, 9:29:40 AM
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> st=new HashSet<>(Arrays.asList(bannedWords));
        int count=0;
        for(String s:message){
            if(st.contains(s))
            count++;
        }
        if(count>=2) return true;
        else return false;
    }
}