// Last updated: 7/10/2026, 9:31:14 AM
class Solution {
    public long interchangeableRectangles(int[][] rec) {
        long res=0;
        HashMap<Double,Integer> hm=new HashMap();
        for(int [] r:rec){
            double ratio=(double)r[0]/r[1];
            res=res+hm.getOrDefault(ratio,0);
            hm.put(ratio,hm.getOrDefault(ratio,0)+1);
        }
        return res;
    
    }
}