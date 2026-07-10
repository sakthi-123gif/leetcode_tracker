// Last updated: 7/10/2026, 9:29:19 AM
class Solution {
    public String reverseWords(String s) {
        int count=0;
        String[] w=s.split(" ");
        for(char c:w[0].toCharArray())
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        for(int i=1;i<w.length;i++){
            int v=0;
            for(char c:w[i].toCharArray())
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    v++;
            if(v==count)
                w[i]=new StringBuilder(w[i]).reverse().toString();
        }
        return String.join(" ",w);
}
}