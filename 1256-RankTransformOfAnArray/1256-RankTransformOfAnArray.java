// Last updated: 7/10/2026, 9:32:45 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> m=new TreeMap<>();
        for(int n:arr){
            m.put(n,0);
        }
        int rank=1;
        for(int num:m.keySet()){
            m.put(num,rank++);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=m.get(arr[i]);
        }
        return arr;
    }
}