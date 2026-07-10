// Last updated: 7/10/2026, 9:32:13 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> str=new ArrayList<>();
        int n=candies.length;
        for(int num:candies){
            max=Math.max(max,num);
        }
      
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
            str.add(true);
            }
            else{
                str.add(false);
            }
        }

        return str;
    }
}