// Last updated: 7/10/2026, 9:29:52 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1)
            res.add(i);
        }
        return res;
    }
}