// Last updated: 7/10/2026, 9:34:25 AM
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
          char[]map="0123456789abcdef".toCharArray();
          StringBuffer br=new StringBuffer();
          while(num!=0){
          int d=num&15;
          br.append(map[d]);
          num>>>=4;
          }
          return br.reverse().toString();
    }
}